package com.demo.spring.dempspring.repository;
import com.demo.spring.dempspring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    
}
