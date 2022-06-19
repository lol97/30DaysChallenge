package com.aglistech.ecommerceproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceProjectApplication {
	private static Logger logger = LoggerFactory.getLogger(ECommerceProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ECommerceProjectApplication.class, args);
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}

}
