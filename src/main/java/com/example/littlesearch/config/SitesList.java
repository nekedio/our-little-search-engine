package com.example.littlesearch.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Component
public class SitesList {
    private List<Site> sitesList;
}
