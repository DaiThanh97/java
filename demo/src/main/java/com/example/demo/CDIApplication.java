package com.example.demo;

import com.example.demo.cdi.SomeCDIBusiness;
import com.example.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CDIApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CDIApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CDIApplication.class, args);
		SomeCDIBusiness business = context.getBean(SomeCDIBusiness.class);
		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
	}
}
