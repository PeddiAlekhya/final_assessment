package com.example.final_assessment.Model;

import org.springframework.data.annotation.Id;

@Entity
@Tables(name = "employees")
public class model1 {

    @Id
    @GeneratedValue(strategy = Generation)
    private long id;
}