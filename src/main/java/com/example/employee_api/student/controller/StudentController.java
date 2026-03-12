package com.example.employee_api.student.controller;

import com.example.employee_api.student.dto.StudentDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @PostMapping
    public String createStudent(@Valid @RequestBody StudentDTO studentDTO) {
        return "Thêm sinh viên thành công";
    }

}