package com.ergroup.tmsweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TmsWebApplication {

    private static final Logger logger = LoggerFactory.getLogger(TmsWebApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(TmsWebApplication.class, args);
        logger.info("tms-web success launch");
    }
}
