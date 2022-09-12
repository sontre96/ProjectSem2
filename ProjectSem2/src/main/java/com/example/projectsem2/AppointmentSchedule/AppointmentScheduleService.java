package com.example.projectsem2.AppointmentSchedule;

import com.example.projectsem2.dto.AppointmentScheduleStatus;
import com.example.projectsem2.dto.CountAppointmentSchedule;
import org.springframework.data.jpa.repository.Query;

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

    // search by status = confirm
    List<AppointmentScheduleStatus> bookingConfirm();

    // search by status = null
    List<AppointmentScheduleStatus> bookingNull();

    // search by status = done
    List<AppointmentScheduleStatus> bookingDone();

    // search by status = cancel
    List<AppointmentScheduleStatus> bookingCancel();

}
