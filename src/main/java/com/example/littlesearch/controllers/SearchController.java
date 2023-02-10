package com.example.littlesearch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

}
