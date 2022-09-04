package com.example.projectsem2.Doctor;

import com.example.projectsem2.dto.CountDoctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<TblDoctor, Long> {
    List<TblDoctor> findAllByOrderByIdAsc();

    //count doctor
    @Query("select new com.example.projectsem2.dto.CountDoctor (s.name, d.status, count(d.name) ) " +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id group by s.name, d.status")
    List<CountDoctor> CountDoctorByName();
}
