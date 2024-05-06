package com.example.SpringCICD_Demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class Controller {

    @GetMapping("/msg")
    public String getMessage() {
        log.info("inside get message");
        log.info("inside get message");
        return "Hello World!";
    }

    @GetMapping("/msg/Asif")
    public String getNewMessage() {
        log.info("inside get new message");
        return "Hello World! Asif";
    }
}
