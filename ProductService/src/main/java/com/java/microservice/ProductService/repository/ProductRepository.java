package com.java.microservice.ProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.microservice.ProductService.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
