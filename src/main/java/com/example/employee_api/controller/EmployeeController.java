package com.example.employee_api.controller;

import com.example.employee_api.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getAllEmployees() {
        Employee e1 = new Employee();
        e1.setId(1L);
        e1.setFullName("Nguyen Van A");
        e1.setSalary(1000.0);

        Employee e2 = new Employee();
        e2.setId(2L);
        e2.setFullName("Tran Thi B");
        e2.setSalary(1200.0);

        Employee e3 = new Employee();
        e3.setId(3L);
        e3.setFullName("Le Van C");
        e3.setSalary(1500.0);

        return List.of(e1, e2, e3);
    }
}