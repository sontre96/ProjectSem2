package com.example.projectsem2.Doctor;

import com.example.projectsem2.dto.CountDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImp implements DoctorService{
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public List<TblDoctor> getAllDoctor() {
        return doctorRepository.findAllByOrderByIdAsc();
    }

    @Override
    public TblDoctor saveDoctor(TblDoctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    @Override
    public TblDoctor findDoctorById(Long id) {
        Optional<TblDoctor> optionalDoctor = doctorRepository.findById(id);
        TblDoctor doctor = null;
        if (optionalDoctor.isPresent()) {
            doctor = optionalDoctor.get();
        }else {
            throw new RuntimeException("Doctor not found for id : "+id);
        }
        return doctor;
    }

    @Override
    public TblDoctor getOne(Long id) {
        return doctorRepository.findById(id).get();
    }

    @Override
    public List<TblDoctor> findAll() {
        return null;
    }

    // count Doctor
    @Override
    public List<CountDoctor> CountDoctorByName() {
        return doctorRepository.CountDoctorByName();
    }
}
