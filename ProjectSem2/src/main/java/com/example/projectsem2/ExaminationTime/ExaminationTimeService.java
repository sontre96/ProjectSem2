package com.example.projectsem2.ExaminationTime;

import com.example.projectsem2.ExaminationPrice.ExaminationPrice;

import java.util.List;

public interface ExaminationTimeService {
    List<ExaminationTime> getAllExaminationTime();

    void saveExaminationTime(ExaminationTime examinationTime);

    void deleteExaminationTime(Long id);

    ExaminationTime getExaminationTimeById(Long id);

    public ExaminationTime getOne(Long id);
}
