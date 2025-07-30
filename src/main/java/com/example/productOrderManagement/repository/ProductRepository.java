package com.example.productOrderManagement.repository;

import com.example.productOrderManagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}