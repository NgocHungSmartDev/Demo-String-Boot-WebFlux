/**
 * EmployeeController.java Jan 22, 2023
 * 
 * Copyright by NgocHung.
 * 
 * Last update Jan 22, 2023
 */
package com.ngochung.WebFlux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ReactiveMathService mathService;

    @GetMapping("/employees")
    private Flux<Employee> getAllEmpployees() {
       return employeeService.findAll();
    }
    
    @GetMapping(value = "table/{input}/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Response> multiplicationTableStream(@PathVariable int input) {
        return this.mathService.multiplicationTable(input);
    }
}
