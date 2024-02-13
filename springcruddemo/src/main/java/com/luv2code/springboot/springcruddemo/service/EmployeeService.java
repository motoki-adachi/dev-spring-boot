package com.luv2code.springboot.springcruddemo.service;

import com.luv2code.springboot.springcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
