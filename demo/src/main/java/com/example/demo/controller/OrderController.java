package com.example.demo.controller;

import com.example.demo.client.PaymentClient;
import com.example.demo.model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final PaymentClient paymentClient;

    public OrderController(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @PostMapping
    public String createOrder(@RequestBody Order order) {

        String response = paymentClient.processPayment(order);

        return "Order Created + " + response;
    }
}