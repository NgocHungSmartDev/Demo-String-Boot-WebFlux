/**
 * Employee.java Jan 22, 2023
 * 
 * Copyright by NgocHung.
 * 
 * Last update Jan 22, 2023
 */

package com.ngochung.WebFlux;

public class Employee {

    private String id;
    private String name;

    public Employee(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
