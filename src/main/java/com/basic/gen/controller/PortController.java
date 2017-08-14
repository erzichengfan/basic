package com.basic.gen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {
    @GetMapping (value = "/say")
    public String say(){
        return "hi";
    }
}
