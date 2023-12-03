package com.nmatute.grpcclientsample.web.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
    
    @GetMapping("/sayHi")
    public String sayHi(){
        return "hi"; 
    }
    
}
