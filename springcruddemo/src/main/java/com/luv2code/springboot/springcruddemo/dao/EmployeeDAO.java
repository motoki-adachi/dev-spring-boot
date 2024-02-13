package com.luv2code.springboot.springcruddemo.dao;

import com.luv2code.springboot.springcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
