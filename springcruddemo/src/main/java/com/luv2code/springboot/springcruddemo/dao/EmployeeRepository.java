package com.luv2code.springboot.springcruddemo.dao;

import com.luv2code.springboot.springcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
