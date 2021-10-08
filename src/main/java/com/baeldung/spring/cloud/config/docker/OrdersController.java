package com.baeldung.spring.cloud.config.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/orders")
    public String getMessage() {
        String products = productsService.request();
        return "An order with products: " + products;
    }
}
