package com.example.employee_api.order.repository;

import com.example.employee_api.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    //tim don hang theo trang thai
    List<Order>
    findByStatus(String status);
    //tim theo ten khach hang
    List<Order>
    findByCustomerNameContaining(String customerName);
}
