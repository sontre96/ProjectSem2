package com.example.projectsem2.AppointmentSchedule;

import com.example.projectsem2.dto.CountAppointmentSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentScheduleServiceImp implements AppointmentScheduleService{
    @Autowired
    AppointmentScheduleRepository appointmentScheduleRepository;

    @Override
    public List<AppointmentSchedule> getAllAppointmentSchedule() {
        return appointmentScheduleRepository.findAllByOrderByIdAsc();
    }

    @Override
    public void saveAppointmentSchedule(AppointmentSchedule appointmentSchedule) {
        appointmentScheduleRepository.save(appointmentSchedule);
    }

    @Override
    public AppointmentSchedule saveAppointmentScheduleInfo(AppointmentSchedule appointmentSchedule) {
        return appointmentScheduleRepository.save(appointmentSchedule);
    }

    @Override
    public void deleteAppointmentSchedule(Long id) {
        appointmentScheduleRepository.deleteById(id);
    }

    @Override
    public AppointmentSchedule getAppointmentScheduleById(Long id) {
        Optional<AppointmentSchedule> optionalAppointmentSchedule = appointmentScheduleRepository.findById(id);
        AppointmentSchedule appointmentSchedule = null;
        if (optionalAppointmentSchedule.isPresent()) {
            appointmentSchedule = optionalAppointmentSchedule.get();
        }else {
            throw new RuntimeException("Appointment Schedule not found for id : "+id);
        }
        return appointmentSchedule;
    }

    @Override
    public AppointmentSchedule getOne(Long id) {
        return appointmentScheduleRepository.findById(id).get();
    }

    @Override
    public List<CountAppointmentSchedule> countAppointmentSchedule() {
        return appointmentScheduleRepository.countAppointmentSchedule();
    }
}
