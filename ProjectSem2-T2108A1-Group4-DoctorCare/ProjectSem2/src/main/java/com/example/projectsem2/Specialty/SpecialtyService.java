package com.example.projectsem2.Specialty;

import java.util.List;

public interface SpecialtyService {
    List<TblSpecialty> getAllSpecialty();

    void saveSpecialty(TblSpecialty specialty);

    void deleteSpecialty(Long id);

    TblSpecialty getSpecialtyById(Long id);

    public TblSpecialty getOne(Long id);
}
