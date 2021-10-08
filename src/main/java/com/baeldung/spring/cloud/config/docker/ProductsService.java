package com.baeldung.spring.cloud.config.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class ProductsService {

    @Value( "${products.url}" )
    private String productsUrl;

    @Autowired
    private RestTemplate restTemplate;


    public String request() {
        return this.restTemplate.getForObject(productsUrl, String.class);

    }
}
