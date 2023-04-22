package com.example.demopro.api;

import com.example.demopro.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Parameter;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestApi {
//    private final StudentService studentService;
    @GetMapping("/123")
    public ResponseEntity getStudent() {
            return ResponseEntity.ok("alo");
    }
    @PostMapping("/123")
    public ResponseEntity postStudent(){return ResponseEntity.ok("hello");}

}





