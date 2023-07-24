package com.example.final_assessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.final_assessment.Model.model1;

public interface repository1 extends JpaRepository<model1, Integer> {

    void saveAll(model1 use);
    
}
