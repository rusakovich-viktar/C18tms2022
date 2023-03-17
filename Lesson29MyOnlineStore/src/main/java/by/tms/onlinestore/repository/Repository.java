package by.tms.onlinestore.repository;

import by.tms.onlinestore.repository.utils.ConnectionPool;
import by.tms.onlinestore.repository.utils.ConnectionWrapper;

public interface Repository {

    default ConnectionWrapper getConnectionWrapper() throws Exception {
        return ConnectionPool.getInstance().getConnectionWrapper();
    }
}
