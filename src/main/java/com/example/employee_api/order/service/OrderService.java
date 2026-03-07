package com.example.employee_api.order.service;

import com.example.employee_api.order.model.Order;
import com.example.employee_api.order.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrdersByStatus(String status) {
        return orderRepository.findByStatus(status);
    }

    public List<Order> getOrdersByCustomerName(String name) {
        return orderRepository.findByCustomerNameContaining(name);
    }
}
