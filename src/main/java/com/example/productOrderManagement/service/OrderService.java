package com.example.productOrderManagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productOrderManagement.dto.OrderRequestDto;
import com.example.productOrderManagement.model.Customer;
import com.example.productOrderManagement.model.Order;
import com.example.productOrderManagement.model.OrderStatus;
import com.example.productOrderManagement.model.Product;
import com.example.productOrderManagement.repository.CustomerRepository;
import com.example.productOrderManagement.repository.OrderRepository;
import com.example.productOrderManagement.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepo;
    private final CustomerRepository customerRepo;
    private final ProductRepository productRepo;

    public Order placeOrder(OrderRequestDto dto) {
        Customer customer = customerRepo.findById(dto.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        List<Product> products = productRepo.findAllById(dto.getProductIds());

        Order order = new Order();
        order.setOrderDate(LocalDateTime.now());
        order.setCustomer(customer);
        order.setProducts(products);
        order.setStatus(OrderStatus.NEW);
        order.setTotalAmount(products.stream().map(p -> p.getPrice().doubleValue()).reduce(0.0, Double::sum));

        return orderRepo.save(order);
    }

    public Order getOrder(Long id) {
        return orderRepo.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    public Order cancelOrder(Long id) {
        Order order = getOrder(id);
        if (order.getStatus() != OrderStatus.CANCELLED) {
            order.setStatus(OrderStatus.CANCELLED);
            orderRepo.save(order);
        }
        return order;
    }
}