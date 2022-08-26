package com.example.projectsem2.Specialty;

import com.example.projectsem2.Contact.TblContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialtyServiceImp implements SpecialtyService{
    @Autowired
    SpecialtyRepository specialtyRepository;

    @Override
    public List<TblSpecialty> getAllSpecialty() {
        return specialtyRepository.findAllByOrderByIdAsc();
    }

    @Override
    public void saveSpecialty(TblSpecialty specialty) {
        specialtyRepository.save(specialty);
    }

    @Override
    public void deleteSpecialty(Long id) {
        specialtyRepository.deleteById(id);
    }

    @Override
    public TblSpecialty getSpecialtyById(Long id) {
        Optional<TblSpecialty> optionalSpecialty = specialtyRepository.findById(id);
        TblSpecialty specialty = null;
        if (optionalSpecialty.isPresent()) {
            specialty = optionalSpecialty.get();
        }else {
            throw new RuntimeException("Specialty not found for id : "+id);
        }
        return specialty;
    }

    @Override
    public TblSpecialty getOne(Long id) {
        return specialtyRepository.findById(id).get();
    }
}
