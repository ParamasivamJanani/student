package com.sgic.lms.controller;

import com.sgic.lms.service.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class C {
    @Autowired
    private B service;

    @GetMapping("/print")
    public String print(){
        return service.addinfo();
    }
}
