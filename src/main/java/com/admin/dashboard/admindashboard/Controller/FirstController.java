package com.admin.dashboard.admindashboard.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FirstController {

    @GetMapping(value="/test")
    public String getMethodName() {
        return "hello";
    }
    
    
}
