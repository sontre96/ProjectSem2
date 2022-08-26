package com.example.projectsem2.Specialty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecialtyRepository extends JpaRepository<TblSpecialty, Long> {
    public List<TblSpecialty> findAllByOrderByIdAsc();

}
