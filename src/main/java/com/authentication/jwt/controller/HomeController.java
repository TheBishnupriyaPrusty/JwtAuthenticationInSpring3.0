package com.authentication.jwt.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@Slf4j
@RestController
public class HomeController {

    @RequestMapping("/test")
    public String test(){
        log.info("This is working message");
        return "Testing message";
    }
    
}
