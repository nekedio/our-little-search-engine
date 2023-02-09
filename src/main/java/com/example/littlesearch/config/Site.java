package com.example.littlesearch.config;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class Site {
    private String url;
    private String name;
    @Override
    public String toString() {
        return "Site{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
