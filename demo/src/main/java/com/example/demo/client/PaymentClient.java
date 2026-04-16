package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "payment-service", url = "http://localhost:8083")
public interface PaymentClient {

    @PostMapping("/payment")
    String processPayment(@RequestBody Object payment);
}