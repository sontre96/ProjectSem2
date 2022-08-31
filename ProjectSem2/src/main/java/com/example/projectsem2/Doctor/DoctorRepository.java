package com.example.projectsem2.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<TblDoctor, Long> {
    List<TblDoctor> findAllByOrderByIdAsc();
}
