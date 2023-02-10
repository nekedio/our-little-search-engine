package com.example.littlesearch;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.littlesearch.config.Site;
import com.example.littlesearch.config.SitesList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private SitesList sitesList;

    @Test
    void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello!")));

    }

    @Test
    void getSitesList() throws Exception {
        for (var site : sitesList.getSitesList()) System.out.println(site);
    }

    @Test
    void logTest() throws Exception {
        Logger logger = LogManager.getLogger(DemoApplication.class.getName());
        logger.error("testing ERROR message log");
    }
}
