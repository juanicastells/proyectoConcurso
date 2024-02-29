package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MaterialEducativo;

@Repository
public interface MaterialEducativoRepository extends JpaRepository <MaterialEducativo, Long> 
{
    
}