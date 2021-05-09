package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private WelcomService welcomService;

    @RequestMapping("/welcome")
    public String welcome() {
        return welcomService.retrieveWelcomeMessage();
    }
}

@Service
class WelcomService {
    public String retrieveWelcomeMessage() {
        return "Welcome service456";
    }
}