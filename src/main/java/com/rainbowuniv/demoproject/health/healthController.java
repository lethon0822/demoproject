package com.rainbowuniv.demoproject.health;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class healthController {

    @GetMapping
    public String health(){
        return "health";
    }
}
