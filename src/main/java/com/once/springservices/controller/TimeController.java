package com.once.springservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TimeController
 */
@Controller
public class TimeController {

    @GetMapping("/time")
    @ResponseBody
    public String time(){
        return "hola";
    }
    
}