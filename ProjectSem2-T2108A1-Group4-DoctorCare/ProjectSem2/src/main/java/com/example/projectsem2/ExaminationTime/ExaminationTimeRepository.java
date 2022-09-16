package com.example.projectsem2.ExaminationTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExaminationTimeRepository extends JpaRepository<ExaminationTime, Long> {
    public List<ExaminationTime> findAllByOrderByIdAsc();
}
