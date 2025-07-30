package com.example.productOrderManagement.repository;

import com.example.productOrderManagement.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}