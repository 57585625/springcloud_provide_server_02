package com.example.provide_server_02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;


@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger("");
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello")
    public String hello(){
        List<String> services = discoveryClient.getServices();
        for(String str:services){
            System.out.println(str);
        }
        return "Hello...";
    }
}
