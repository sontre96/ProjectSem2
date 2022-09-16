package com.example.projectsem2.ExaminationDay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExaminationDayRepository extends JpaRepository<ExaminationDay, Long> {
    public List<ExaminationDay> findAllByOrderByIdAsc();
}
