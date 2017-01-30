package com.f1soft.webapp.controller;

import com.f1soft.entities.Employee;
import com.f1soft.logic.service.EmployeeService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nikesh
 */
@RestController
@RequestMapping(value = "/v1/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<Collection<Employee>> getAllEmployees() {
        Collection<Employee> allEmployee = employeeService.getAllEmployee();

        return new ResponseEntity<>(allEmployee, HttpStatus.OK);
    }

}
