package com.example.projectsem2.ExaminationSchedule;

import com.example.projectsem2.ExaminationPrice.ExaminationPrice;

import java.util.List;

public interface ExaminationScheduleService {
    List<ExaminationSchedule> getAllExaminationSchedule();

    void saveExaminationSchedule(ExaminationSchedule examinationSchedule);

    void deleteExaminationSchedule(Long id);

    ExaminationSchedule getExaminationScheduleById(Long id);

    public ExaminationSchedule getOne(Long id);
}
