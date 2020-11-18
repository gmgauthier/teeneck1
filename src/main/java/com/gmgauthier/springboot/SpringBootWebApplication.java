package com.gmgauthier.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootWebApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringBootWebApplication.class);

    @Autowired
    private DemoProperties demoProperties;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

    @PostConstruct
    public void init() {

        logger.info(demoProperties.toString());
    }
}