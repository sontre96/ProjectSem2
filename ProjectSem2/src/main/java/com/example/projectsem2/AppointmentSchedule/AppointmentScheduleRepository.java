package com.example.projectsem2.AppointmentSchedule;

import com.example.projectsem2.dto.CountAppointmentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentScheduleRepository extends JpaRepository<AppointmentSchedule, Long> {
    public List<AppointmentSchedule> findAllByOrderByIdAsc();

    //count Appointment Schedule
    @Query("select new com.example.projectsem2.dto.CountAppointmentSchedule (a.name, a.orderDate, e.name, count(s.name) ) " +
            "from AppointmentSchedule a inner join TblSpecialty s on a.specialtiesId = s.id inner join " +
            "ExaminationTime e on a.TimeId = e.id group by a.name, a.orderDate, e.name")
    List<CountAppointmentSchedule> countAppointmentSchedule();
}
