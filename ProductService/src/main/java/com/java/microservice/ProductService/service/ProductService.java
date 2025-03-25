package com.java.microservice.ProductService.service;

import com.java.microservicer.ProductService.model.ProductRequest;
import com.java.microservicer.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
