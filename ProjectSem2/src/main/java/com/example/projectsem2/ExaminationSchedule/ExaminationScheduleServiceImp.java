package com.example.projectsem2.ExaminationSchedule;

import com.example.projectsem2.ExaminationPrice.ExaminationPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExaminationScheduleServiceImp implements ExaminationScheduleService{
    @Autowired
    ExaminationScheduleRepository examinationScheduleRepository;

    @Override
    public List<ExaminationSchedule> getAllExaminationSchedule() {
        return examinationScheduleRepository.findAllByOrderByIdAsc();
    }

    @Override
    public void saveExaminationSchedule(ExaminationSchedule examinationSchedule) {
        examinationScheduleRepository.save(examinationSchedule);
    }

    @Override
    public void deleteExaminationSchedule(Long id) {
        examinationScheduleRepository.deleteById(id);
    }

    @Override
    public ExaminationSchedule getExaminationScheduleById(Long id) {
        Optional<ExaminationSchedule> optionalExaminationSchedule = examinationScheduleRepository.findById(id);
        ExaminationSchedule examinationSchedule = null;
        if (optionalExaminationSchedule.isPresent()) {
            examinationSchedule = optionalExaminationSchedule.get();
        }else {
            throw new RuntimeException("Examination Schedule not found for id : "+id);
        }
        return examinationSchedule;
    }

    @Override
    public ExaminationSchedule getOne(Long id) {
        return examinationScheduleRepository.findById(id).get();
    }
}
