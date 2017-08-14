package com.basic.gen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("port")
public class PortController {
    @GetMapping (value = "/say1")
    public String say(){
        return "hi";
    }
}
