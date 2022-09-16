package com.example.projectsem2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorsDTO {
    private String name;
    private boolean gender;
    private String nameSpecialty;
    private boolean statusDoctor;
}
