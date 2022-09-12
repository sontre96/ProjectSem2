package com.example.projectsem2.ExaminationDay;

import com.example.projectsem2.ExaminationSchedule.ExaminationSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExaminationDayServiceImp implements ExaminationDayService {
    @Autowired
    ExaminationDayRepository examinationDayRepository;

    @Override
    public List<ExaminationDay> getAllExaminationDay() {
        return examinationDayRepository.findAllByOrderByIdAsc();
    }

    @Override
    public void saveExaminationDay(ExaminationDay examinationDay) {
        examinationDayRepository.save(examinationDay);
    }

    @Override
    public void deleteExaminationDay(Long id) {
        examinationDayRepository.deleteById(id);
    }

    @Override
    public ExaminationDay getExaminationDayById(Long id) {
        Optional<ExaminationDay> optionalExaminationDay = examinationDayRepository.findById(id);
        ExaminationDay examinationDay = null;
        if (optionalExaminationDay.isPresent()) {
            examinationDay = optionalExaminationDay.get();
        }else {
            throw new RuntimeException("Examination Day not found for id : "+id);
        }
        return examinationDay;
    }

    @Override
    public ExaminationDay getOne(Long id) {
        return examinationDayRepository.findById(id).get();
    }
}
