package com.example.projectsem2.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorService {
    List<TblDoctor> getAllDoctor();

    TblDoctor saveDoctor(TblDoctor doctor);

    void deleteDoctor(Long id);

    TblDoctor findDoctorById(Long id);

    public TblDoctor getOne(Long id);

    List<TblDoctor> findAll();
}
