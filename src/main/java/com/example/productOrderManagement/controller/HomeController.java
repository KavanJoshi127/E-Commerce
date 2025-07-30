package com.example.productOrderManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Product Order Management API is running! Visit /swagger-ui/index.html for documentation.";
    }
}
