package com.example.projectsem2.AppointmentSchedule;

import java.util.List;

public interface AppointmentScheduleService {
    List<AppointmentSchedule> getAllAppointmentSchedule();

    void saveAppointmentSchedule(AppointmentSchedule appointmentSchedule);

    void deleteAppointmentSchedule(Long id);

    AppointmentSchedule getAppointmentScheduleById(Long id);

    public AppointmentSchedule getOne(Long id);
}
