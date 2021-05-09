package com.example.database;

import com.example.database.entity.Person;
import com.example.database.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("Delete 10002 -> Number of rows - {}", dao.deleteById(10002));
		logger.info("Inserting 10004 -> {}", dao.insert(new Person(10004, "Tarzan", "Berlin", new Date())));
		logger.info("Update 10003 -> Number of rows - {}", dao.update(new Person(10003, "Tarzan Copy", "Berlin123", new Date())));
	}
}
