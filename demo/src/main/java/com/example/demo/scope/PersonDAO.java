package com.example.demo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
    private JDBCConnection jdbcConnection;

    @Autowired
    public PersonDAO(JDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public JDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }


}
