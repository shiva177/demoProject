package com.demo.spring.dempspring.repository;

import com.demo.spring.dempspring.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username); // To find admin by username
}
