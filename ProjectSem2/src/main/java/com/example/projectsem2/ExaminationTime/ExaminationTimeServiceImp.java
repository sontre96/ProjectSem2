package com.example.projectsem2.ExaminationTime;

import com.example.projectsem2.ExaminationPrice.ExaminationPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExaminationTimeServiceImp implements ExaminationTimeService{
    @Autowired
    ExaminationTimeRepository examinationTimeRepository;

    @Override
    public List<ExaminationTime> getAllExaminationTime() {
        return examinationTimeRepository.findAllByOrderByIdAsc();
    }

    @Override
    public void saveExaminationTime(ExaminationTime examinationTime) {
        examinationTimeRepository.save(examinationTime);
    }

    @Override
    public void deleteExaminationTime(Long id) {
        examinationTimeRepository.deleteById(id);
    }

    @Override
    public ExaminationTime getExaminationTimeById(Long id) {
        Optional<ExaminationTime> optionalExaminationTime = examinationTimeRepository.findById(id);
        ExaminationTime examinationTime = null;
        if (optionalExaminationTime.isPresent()) {
            examinationTime = optionalExaminationTime.get();
        }else {
            throw new RuntimeException("ExaminationTime not found for id : "+id);
        }
        return examinationTime;
    }

    @Override
    public ExaminationTime getOne(Long id) {
        return examinationTimeRepository.findById(id).get();
    }
}
