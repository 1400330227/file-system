package com.computerscience.hdfsapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HdfsApiApplication {
    private static final Logger logger = LoggerFactory.getLogger(HdfsApiApplication.class);

    public static void main(String[] args) {
        logger.info("Starting HDFS API application...");
        SpringApplication.run(HdfsApiApplication.class, args);
    }
} 