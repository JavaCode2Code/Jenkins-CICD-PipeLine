package com.aws.controller;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControoler {

  public static  Logger logger = org.slf4j.LoggerFactory.getLogger(TestControoler.class);
    @GetMapping("/test")
    public String getTest() {
        logger.info("Test endpoint called");
        return "Jenkins apk deploy successful";
    }
}
