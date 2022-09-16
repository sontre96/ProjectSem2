package com.example.projectsem2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentScheduleStatus {
    private Long id;
    private String name;
    private String phone;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date orderDate;
    private String specialtyName;
    private String time;
    private String price;
    private String orderStatus;
}
