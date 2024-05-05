package com.example.SpringCICD_Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/msg")
    public String getMessage(){
        return "Hello World!";
    

    @GetMapping("/msg/Asif")
    public String getNewMessage(){
        return "Hello World! Asif";
    }
}
