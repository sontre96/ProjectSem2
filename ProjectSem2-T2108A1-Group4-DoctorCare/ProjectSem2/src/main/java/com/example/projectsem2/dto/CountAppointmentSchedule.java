package com.example.projectsem2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountAppointmentSchedule {
    private String name;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date orderDate;
    private String time;
    private long numberOfRegisteredCustomers;
}
