package com.demo.spring.dempspring.repository;
import com.demo.spring.dempspring.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsersRepo extends JpaRepository<Users, Integer> {

    
}
