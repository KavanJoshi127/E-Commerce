package com.example.productOrderManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productOrderManagement.model.Product;
import com.example.productOrderManagement.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAll() {
        return productRepo.findAll();
    }
}