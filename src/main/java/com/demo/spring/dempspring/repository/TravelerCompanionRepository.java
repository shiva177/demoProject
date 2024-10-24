package com.demo.spring.dempspring.repository;

import com.demo.spring.dempspring.model.TravelerCompanion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelerCompanionRepository extends JpaRepository<TravelerCompanion, Long> {
}
