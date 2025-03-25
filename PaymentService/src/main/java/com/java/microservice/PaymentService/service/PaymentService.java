package com.java.microservice.PaymentService.service;

import com.java.microservice.PaymentService.model.PaymentRequest;
import com.java.microservice.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
