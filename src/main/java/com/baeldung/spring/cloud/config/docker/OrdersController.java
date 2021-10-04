package com.baeldung.spring.cloud.config.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @GetMapping("/orders")
    public String getMessage() {
        return "An order";
    }
}
