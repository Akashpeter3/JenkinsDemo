package com.app.jenkinsdemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

    public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

    @PostConstruct
    public void init() {
        logger.info("JenkinsDemoApplication initializing...")
    }


    public static void main(String[] args) {
        logger.info("JenkinsDemoApplication starting...");
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
