package com.java.microservice.OrderService.service;

import com.java.microservice.OrderService.model.OrderRequest;
import com.java.microservice.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
