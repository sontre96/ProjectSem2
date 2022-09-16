package com.example.projectsem2.AppointmentSchedule;

import com.example.projectsem2.dto.AppointmentScheduleStatus;
import com.example.projectsem2.dto.CountAppointmentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentScheduleRepository extends JpaRepository<AppointmentSchedule, Long> {
    public List<AppointmentSchedule> findAllByOrderByOrderDateDesc();

    //count Appointment Schedule
    @Query("select new com.example.projectsem2.dto.CountAppointmentSchedule (s.name, a.orderDate, e.name, count(s.name) ) " +
            "from AppointmentSchedule a inner join TblSpecialty s on a.specialtiesId = s.id inner join " +
            "ExaminationTime e on a.TimeId = e.id  group by s.name, a.orderDate, e.name order by a.orderDate desc")
    List<CountAppointmentSchedule> countAppointmentSchedule();

    // search by status = null
    @Query("select new com.example.projectsem2.dto.AppointmentScheduleStatus " +
            "(a.id,a.name, a.phone, a.orderDate, s.name, t.name, p.name, a.orderStatus) " +
            "from AppointmentSchedule a inner join TblSpecialty s on a.specialtiesId = s.id inner join " +
            "ExaminationTime t on a.TimeId = t.id inner join ExaminationPrice p on a.PriceId = p.id  where a.orderStatus is null order by a.orderDate desc")
    List<AppointmentScheduleStatus> bookingNull();

    // search by status = confirm
    @Query("select new com.example.projectsem2.dto.AppointmentScheduleStatus " +
            "(a.id,a.name, a.phone, a.orderDate, s.name, t.name, p.name, a.orderStatus) " +
            "from AppointmentSchedule a inner join TblSpecialty s on a.specialtiesId = s.id inner join " +
            "ExaminationTime t on a.TimeId = t.id inner join ExaminationPrice p on a.PriceId = p.id  where a.orderStatus like ('confirm') order by a.orderDate desc")
    List<AppointmentScheduleStatus> bookingConfirm();

    // search by status = done
    @Query("select new com.example.projectsem2.dto.AppointmentScheduleStatus " +
            "(a.id,a.name, a.phone, a.orderDate , s.name, t.name, p.name, a.orderStatus) " +
            "from AppointmentSchedule a inner join TblSpecialty s on a.specialtiesId = s.id inner join " +
            "ExaminationTime t on a.TimeId = t.id inner join ExaminationPrice p on a.PriceId = p.id  where a.orderStatus like ('done') order by a.orderDate desc")
    List<AppointmentScheduleStatus> bookingDone();

    // search by status = cancel
    @Query("select new com.example.projectsem2.dto.AppointmentScheduleStatus " +
            "(a.id,a.name, a.phone, a.orderDate, s.name, t.name, p.name, a.orderStatus) " +
            "from AppointmentSchedule a inner join TblSpecialty s on a.specialtiesId = s.id inner join " +
            "ExaminationTime t on a.TimeId = t.id inner join ExaminationPrice p on a.PriceId = p.id  where a.orderStatus like ('Cancel') order by a.orderDate desc")
    List<AppointmentScheduleStatus> bookingCancel();

}
