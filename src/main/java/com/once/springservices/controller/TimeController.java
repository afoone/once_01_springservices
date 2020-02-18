package com.once.springservices.controller;

import com.once.springservices.service.HelloService;
import com.once.springservices.service.TimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TimeController
 */
@Controller
public class TimeController {


    @Autowired
    private HelloService helloService;

    @Autowired
    private TimeService ts;

    @GetMapping("/time")
    @ResponseBody
    public String time(){
        return ts.getTiempo();
    }

    
    
}