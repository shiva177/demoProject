package com.demo.spring.dempspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.dempspring.model.Employee;
import com.demo.spring.dempspring.repository.EmployeeRepo;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {


@Autowired
EmployeeRepo employeeRepo;

  //http://localhost:port/emp/add
  @PostMapping("/add")
  Employee addEmployee(@RequestBody Employee employee){

    employeeRepo.save(employee);
    return employee;
  }

  @GetMapping("/getAll")
  List<Employee> getEmployee(){

    List<Employee>employee =employeeRepo.findAll();

    return employee;
  }
  
}
