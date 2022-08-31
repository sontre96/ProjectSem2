package com.example.projectsem2.AppointmentSchedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentScheduleRepository extends JpaRepository<AppointmentSchedule, Long> {
    public List<AppointmentSchedule> findAllByOrderByIdAsc();
}
