package com.example.projectsem2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountDoctor {
    private String nameSpecialty;
    private boolean status;
    private long numberOfDoctors;
}
