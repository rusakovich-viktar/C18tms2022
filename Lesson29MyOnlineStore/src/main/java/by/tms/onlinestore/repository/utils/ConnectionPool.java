package by.tms.onlinestore.repository.utils;

import lombok.extern.slf4j.Slf4j;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class ConnectionPool {

    //Singleton instance
    private static volatile ConnectionPool instance;

    //Configuration properties
    private static final String DB_PROPERTY_FILE = "application";
    private static final String DB_URL = "db.url";
    private static final String DB_LOGIN = "db.login";
    private static final String DB_PASS = "db.pass";
    private static final String DB_DRIVER = "db.driver";

    private static final int MAX_CONNECTION_COUNT = 10;
    private static final int MIN_CONNECTION_COUNT = 5;

    private static final String URL;
    private static final String LOGIN;
    private static final String PASS;
    private static final String DRIVER;

    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(DB_PROPERTY_FILE);
        URL = resourceBundle.getString(DB_URL);
        LOGIN = resourceBundle.getString(DB_LOGIN);
        PASS = resourceBundle.getString(DB_PASS);
        DRIVER = resourceBundle.getString(DB_DRIVER);
    }

    private final AtomicInteger currentConnectionNumber = new AtomicInteger(MIN_CONNECTION_COUNT);
    private final BlockingQueue<ConnectionWrapper> pool = new ArrayBlockingQueue<>(MAX_CONNECTION_COUNT, true);

    //Singleton
    public static ConnectionPool getInstance() {
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            }
        }
        return instance;
    }

    //Add new connection to queue in constructor
    private ConnectionPool() {
        for (int i = 0; i < MIN_CONNECTION_COUNT; i++) {
            try {
                Class.forName(DRIVER);
                pool.add(new ConnectionWrapper(DriverManager.getConnection(URL, LOGIN, PASS), this));
            } catch (SQLException e) {
                System.out.println("SQLException ConnectionPool" + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Exception from Class.forName(DRIVER)" + e.getMessage());
            }
        }
    }

    private void openAdditionalConnection() throws Exception {
        try {
            System.out.println("Current connection number: " + currentConnectionNumber.get() + " Pool size: " + pool.size());
            Class.forName(DRIVER);
            pool.add(new ConnectionWrapper(DriverManager.getConnection(URL, LOGIN, PASS), this));
            currentConnectionNumber.incrementAndGet();
        } catch (SQLException e) {
            throw new Exception("New connection wasn't add in the connection pool", e);
        }
    }

    public ConnectionWrapper getConnectionWrapper() throws Exception {
        ConnectionWrapper connectionWrapper;
        try {
            if (pool.isEmpty() && currentConnectionNumber.get() < MAX_CONNECTION_COUNT) {
                openAdditionalConnection();
            }
            log.info("Pool size before taking connection: " + pool.size());
            connectionWrapper = pool.take();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new Exception("Max count of connections was reached!");
        }
        return connectionWrapper;
    }

    public void closeConnection(ConnectionWrapper connectionWrapper) throws Exception {
        if (connectionWrapper != null) {
            if (currentConnectionNumber.get() > MIN_CONNECTION_COUNT) {
                currentConnectionNumber.decrementAndGet();
            }
            try {
                System.out.println("Before add to pool - Pool size: " + pool.size());
                pool.put(connectionWrapper);
                System.out.println("After add to pool - Pool size: " + pool.size());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                log.error("Connection wasn't returned into pool properly");
            }
        }
    }

    public void closeAllConnection() {
        for (ConnectionWrapper connectionWrapper : pool) {
            try {
                if (connectionWrapper != null && connectionWrapper.getConnection() != null) {
                    connectionWrapper.getConnection().close();
                }
            } catch (Exception e) {
                log.error("Some connection cannot be closed: ", e);
            }
        }
    }
}