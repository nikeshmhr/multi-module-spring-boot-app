package com.f1soft.logic.service.impl;

import com.f1soft.entities.Employee;
import com.f1soft.logic.repositories.EmployeeRepository;
import com.f1soft.logic.service.EmployeeService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nikesh
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee createEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        return repo.findOne(id);
    }

    @Override
    public Collection<Employee> getAllEmployee() {
        return repo.findAll();
    }

}
