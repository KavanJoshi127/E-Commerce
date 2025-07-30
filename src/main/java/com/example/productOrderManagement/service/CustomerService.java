package com.example.productOrderManagement.service;

import org.springframework.stereotype.Service;

import com.example.productOrderManagement.model.Customer;
import com.example.productOrderManagement.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepo;

    public Customer getCustomerById(Long id) {
        return customerRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + id));
    }

    public Customer register(Customer customer) {
        return customerRepo.save(customer);
    }

}

