package com.sgic.lms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


@RestController
public class FirstRestExample {
    @GetMapping("/hello")
    public ResponseEntity<Object> getall(){
        return ResponseEntity.ok("Hello this is my REST API");
    }

    @RequestMapping("/hello-first")
    public Map<String, String> callmethod (){
        Map<String, String> map = new HashMap<>();
        map.put("Message","Hello");
        map.put("Mesage","Hello2");
        map.put("Message","Janani");
        map.put("Message","Hello");
        map.put("Message","Hello");
        return map;
    }
}
