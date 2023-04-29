package by.tms.repository.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
@RequiredArgsConstructor
public class ConnectionWrapper implements AutoCloseable {

    private final Connection connection;
    private final ConnectionPool connectionPool;

//    public ConnectionWrapper(Connection connection, ConnectionPool connectionPool) {
//        this.connection = connection;
//        this.connectionPool = connectionPool;
//    }

    public Connection getConnection() {
        return connection;
    }

    @Override
    public void close() throws Exception {
        connectionPool.closeConnection(this);
    }
}
