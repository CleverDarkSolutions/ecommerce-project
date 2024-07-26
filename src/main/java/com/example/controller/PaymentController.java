package com.example.controller;

import com.example.service.PaymentService;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create-payment-intent")
    public PaymentIntent createPaymentIntent(@RequestParam Long amount) throws StripeException {
        return paymentService.createPaymentIntent(amount);
    }

    // Add endpoint for handling Stripe webhooks if necessary
    @PostMapping("/webhook")
    public void handleWebhook(@RequestBody String payload, @RequestHeader("Stripe-Signature") String sigHeader) {
        // Handle webhook events here
    }
}
