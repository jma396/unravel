package com.jma396.unravel.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jma396/unravel")
public class FileTransformationController {
    @GetMapping("/status")
    public String checkServiceStatus() {
        return "Service is running!";
    }
}
