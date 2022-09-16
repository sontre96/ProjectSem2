package com.example.projectsem2.ExaminationSchedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExaminationScheduleRepository extends JpaRepository<ExaminationSchedule, Long> {

    public List<ExaminationSchedule> findAllByOrderByIdAsc();
}
