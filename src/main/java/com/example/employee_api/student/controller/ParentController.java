package com.example.employee_api.student.controller;

import com.example.employee_api.student.dto.ParentDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/parents")
public class ParentController {

    @PostMapping
    public String createParent(@Valid @RequestBody ParentDTO parentDTO) {
        return "Thêm phụ huynh thành công";
    }
}