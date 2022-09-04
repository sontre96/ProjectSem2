package com.example.projectsem2.AppointmentSchedule;

import com.example.projectsem2.dto.CountAppointmentSchedule;

import java.util.List;

public interface AppointmentScheduleService {
    List<AppointmentSchedule> getAllAppointmentSchedule();

    void saveAppointmentSchedule(AppointmentSchedule appointmentSchedule);

    AppointmentSchedule saveAppointmentScheduleInfo(AppointmentSchedule appointmentSchedule);

    void deleteAppointmentSchedule(Long id);

    AppointmentSchedule getAppointmentScheduleById(Long id);

    public AppointmentSchedule getOne(Long id);

    //Count Appointment Schedule
    List<CountAppointmentSchedule> countAppointmentSchedule();
}
