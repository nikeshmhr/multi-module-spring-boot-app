package com.f1soft.logic.repositories;

import com.f1soft.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nikesh
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
