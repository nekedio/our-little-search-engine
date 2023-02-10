package com.example.littlesearch;

import com.example.littlesearch.config.SitesList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private SitesList sitesList;

    @GetMapping("/hello")
    public String getHello() {
        System.out.println("*************************************");
        System.out.println(sitesList.getSitesList());
        System.out.println("*************************************");

        return "Hello!";
    }
}
