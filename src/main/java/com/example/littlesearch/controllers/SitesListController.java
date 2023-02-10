package com.example.littlesearch.controllers;

import com.example.littlesearch.config.SitesList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sites")
@RequiredArgsConstructor
public class SitesListController {

    private final SitesList sitesList;
    @GetMapping
    public String showSites(Model model) {
        model.addAttribute("sites", sitesList.getSitesList());
        return "sites";
    }
}
