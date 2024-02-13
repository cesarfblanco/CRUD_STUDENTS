package com.cafb.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cafb.app.entity.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long>{

}
