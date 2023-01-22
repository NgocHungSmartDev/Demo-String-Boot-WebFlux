/**
 * EmployeeController.java Jan 22, 2023
 * 
 * Copyright by NgocHung.
 * 
 * Last update Jan 22, 2023
 */
package com.ngochung.WebFlux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    private Flux<Employee> getAllEmpployees() {
       return employeeService.findAll();
    }
}
