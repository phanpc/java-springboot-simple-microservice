package com.phanpc.springboot.rest.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phanpc.springboot.rest.example.student.StudentRepository;

@SpringBootApplication
public class RestServiceApplication {
    @Autowired
    StudentRepository studentRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }
}
