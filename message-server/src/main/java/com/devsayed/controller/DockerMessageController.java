package com.devsayed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessageController {
    @GetMapping("/hello")
    public String getMessage() {
        return "Hello from Docker!";
    }
}