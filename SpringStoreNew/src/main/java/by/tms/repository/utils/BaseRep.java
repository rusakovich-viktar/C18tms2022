package by.tms.repository.utils;

import org.springframework.stereotype.Repository;

@Repository
public class BaseRep {
    public ConnectionPool connectionPool = ConnectionPool.getInstance();
}