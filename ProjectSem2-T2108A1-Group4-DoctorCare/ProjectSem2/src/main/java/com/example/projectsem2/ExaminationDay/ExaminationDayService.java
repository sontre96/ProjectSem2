package com.example.projectsem2.ExaminationDay;


import java.util.List;

public interface ExaminationDayService {
    List<ExaminationDay> getAllExaminationDay();

    void saveExaminationDay(ExaminationDay examinationDay);

    void deleteExaminationDay(Long id);

    ExaminationDay getExaminationDayById(Long id);

    public ExaminationDay getOne(Long id);
}
