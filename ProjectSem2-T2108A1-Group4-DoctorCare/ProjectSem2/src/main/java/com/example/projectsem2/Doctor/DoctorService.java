package com.example.projectsem2.Doctor;

import com.example.projectsem2.dto.CountDoctor;
import com.example.projectsem2.dto.DoctorsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorService {
    List<TblDoctor> getAllDoctor();

    TblDoctor saveDoctor(TblDoctor doctor);

    void deleteDoctor(Long id);

    TblDoctor findDoctorById(Long id);

    public TblDoctor getOne(Long id);

    List<TblDoctor> findAll();

    // count Doctor
    List<CountDoctor> CountDoctorByName();

    //search doctors in cardiology Department
    List<DoctorsDTO> doctorCardiology();

    //search doctors in department of central nervous system
    List<DoctorsDTO> doctorCentralNervousSystem();

    //search doctors in Fertility Center
    List<DoctorsDTO> doctorFertilityCenter();

    //search doctors in Medical Examination Department
    List<DoctorsDTO> doctorMedicalExaminationDepartment();

    //search doctors in Orthopedic Department
    List<DoctorsDTO> doctorOrthopedicDepartment();

    //search doctors in Otorhinolaryngology
    List<DoctorsDTO> doctorOtorhinolaryngology();

    //search doctors in Pediatrics Department
    List<DoctorsDTO> doctorPediatricsDepartment();

    //search doctors in Pharmacy Department
    List<DoctorsDTO> doctorPharmacyDepartment();

    //search doctors in Respiratory Medicine
    List<DoctorsDTO> doctorRespiratoryMedicine();

    //search doctors in Testing Center
    List<DoctorsDTO> doctorTestingCenter();

    //search doctors in Vaccination Center
    List<DoctorsDTO> doctorVaccinationCenter();

    //search doctors in Training and Research Center
    List<DoctorsDTO> doctorTrainingAndResearchCenter();
}
