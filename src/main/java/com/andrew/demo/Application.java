package com.andrew.demo;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



//    @PostConstruct
//    public void getDbManager() {
//        DatabaseManagerSwing.main(
//                new String[]{"--url", "jdbc:hsqldb:mem:testdb", "--user", "sa", "--password", ""});
//    }

}
