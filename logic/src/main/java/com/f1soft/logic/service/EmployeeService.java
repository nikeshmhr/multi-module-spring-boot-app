package com.f1soft.logic.service;

import com.f1soft.entities.Employee;
import java.util.Collection;

/**
 *
 * @author nikesh
 */
public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee getEmployeeById(long id);

    Collection<Employee> getAllEmployee();

}
