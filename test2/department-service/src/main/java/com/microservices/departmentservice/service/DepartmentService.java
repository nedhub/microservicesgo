package com.microservices.departmentservice.service;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@JsonSerializableSchema


@Service

public class DepartmentService {
    @Autowired


    private DepartmentRepository departmentRepository;

    public Department save(Department department) {
        return departmentRepository.save(department);
    }




}