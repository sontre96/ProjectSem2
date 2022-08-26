package com.example.projectsem2.ExaminationPrice;

import com.example.projectsem2.Contact.TblContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExaminationPriceServiceImp implements ExaminationPriceService {
    @Autowired
    ExaminationPriceRepository examinationPriceRepository;

    @Override
    public List<ExaminationPrice> getAllExaminationPrice() {
        return examinationPriceRepository.findAllByOrderByIdAsc();
    }

    @Override
    public void saveExaminationPrice(ExaminationPrice examinationPrice) {
        examinationPriceRepository.save(examinationPrice);
    }

    @Override
    public void deleteExaminationPrice(Long id) {
        examinationPriceRepository.deleteById(id);
    }

    @Override
    public ExaminationPrice getExaminationPriceById(Long id) {
        Optional<ExaminationPrice> optionalExaminationPrice = examinationPriceRepository.findById(id);
        ExaminationPrice examinationPrice = null;
        if (optionalExaminationPrice.isPresent()) {
            examinationPrice = optionalExaminationPrice.get();
        }else {
            throw new RuntimeException("ExaminationPrice not found for id : "+id);
        }
        return examinationPrice;
    }

    @Override
    public ExaminationPrice getOne(Long id) {
        return examinationPriceRepository.findById(id).get();
    }
}
