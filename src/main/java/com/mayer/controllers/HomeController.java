package com.mayer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Admin on 25.11.2016.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "test";
    }
}
