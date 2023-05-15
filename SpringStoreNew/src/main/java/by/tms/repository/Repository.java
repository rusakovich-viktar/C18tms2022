package by.tms.repository;

import by.tms.repository.utils.ConnectionPool;
import by.tms.repository.utils.ConnectionWrapper;

public interface Repository {

    default ConnectionWrapper getConnectionWrapper() throws Exception {
        return ConnectionPool.getInstance().getConnectionWrapper();
    }
}
