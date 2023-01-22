/**
 * EmployeeService.java Jan 22, 2023
 * 
 * Copyright by NgocHung.
 * 
 * Last update Jan 22, 2023
 */
package com.ngochung.WebFlux;

import reactor.core.publisher.Flux;

public interface EmployeeService {

    Flux<Employee> findAll();
}
