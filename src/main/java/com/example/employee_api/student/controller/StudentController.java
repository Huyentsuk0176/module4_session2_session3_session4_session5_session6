package com.example.employee_api.student.controller;
import com.example.employee_api.exception.StudentNotFoundException;
import com.example.employee_api.student.dto.StudentDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @PostMapping
    public String createStudent(@Valid @RequestBody StudentDTO studentDTO) {
        return "Thêm sinh viên thành công";
    }

        List<Map<String, Object>> students = Arrays.asList(
                Map.of("id",1,"name","Nguyen Van A"),
                Map.of("id",2,"name","Tran Thi B"),
                Map.of("id",3,"name","Le Van C")
        );

        @GetMapping("/{id}")
        public Map<String,Object> getStudent(@PathVariable Integer id){

            return students.stream()
                    .filter(s -> s.get("id").equals(id))
                    .findFirst()
                    .orElseThrow(() -> new StudentNotFoundException("Sinh viên không tồn tại"));
        }
    }

