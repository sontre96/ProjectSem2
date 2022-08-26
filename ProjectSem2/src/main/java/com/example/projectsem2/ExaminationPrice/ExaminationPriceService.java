package com.example.projectsem2.ExaminationPrice;

import java.util.List;

public interface ExaminationPriceService {
    List<ExaminationPrice> getAllExaminationPrice();

    void saveExaminationPrice(ExaminationPrice examinationPrice);

    void deleteExaminationPrice(Long id);

    ExaminationPrice getExaminationPriceById(Long id);

    public ExaminationPrice getOne(Long id);
}
