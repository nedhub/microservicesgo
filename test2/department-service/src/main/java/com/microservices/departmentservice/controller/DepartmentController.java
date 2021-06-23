package com.microservices.departmentservice.controller;

import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController 
@RequestMapping("/department")
@Slf4j
public class DepartmentController {



    @Autowired
    private DepartmentService departmentservice;



    @PostMapping("/")


    public Department save(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        
        return departmentservice.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.
    }
}
