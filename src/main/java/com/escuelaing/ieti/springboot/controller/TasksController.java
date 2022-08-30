package com.escuelaing.ieti.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TasksController {

    @GetMapping("/api")
    public String sayHello(){
        System.out.println("Print: Hello!!!");
        return "Hello!!!";
    }
}
