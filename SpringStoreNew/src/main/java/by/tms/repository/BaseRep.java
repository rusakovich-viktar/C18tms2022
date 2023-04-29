package by.tms.repository;

import by.tms.repository.utils.ConnectionPool;
import org.springframework.stereotype.Repository;

@Repository
public class BaseRep {
    public ConnectionPool connectionPool = ConnectionPool.getInstance();
}