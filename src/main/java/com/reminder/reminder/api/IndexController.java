package com.reminder.reminder.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    
    @RequestMapping
    public String index() {
        return "Welcome to Reminder API";
    }
    
}
