package com.example.littlesearch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.apache.logging.log4j.Logger.*;

@SpringBootApplication
public class DemoApplication {
    private static Logger logger = LogManager.getLogger(DemoApplication.class.getName());


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        logger.info("testing info logging");
        logger.error("testing error message");
    }

}
