package com.example.projectsem2.Doctor;

import com.example.projectsem2.dto.CountDoctor;
import com.example.projectsem2.dto.DoctorsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImp implements DoctorService{
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public List<TblDoctor> getAllDoctor() {
        return doctorRepository.findAllByOrderByIdAsc();
    }

    @Override
    public TblDoctor saveDoctor(TblDoctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    @Override
    public TblDoctor findDoctorById(Long id) {
        Optional<TblDoctor> optionalDoctor = doctorRepository.findById(id);
        TblDoctor doctor = null;
        if (optionalDoctor.isPresent()) {
            doctor = optionalDoctor.get();
        }else {
            throw new RuntimeException("Doctor not found for id : "+id);
        }
        return doctor;
    }

    @Override
    public TblDoctor getOne(Long id) {
        return doctorRepository.findById(id).get();
    }

    @Override
    public List<TblDoctor> findAll() {
        return null;
    }

    // count Doctor
    @Override
    public List<CountDoctor> CountDoctorByName() {
        return doctorRepository.CountDoctorByName();
    }

    @Override
    public List<DoctorsDTO> doctorCardiology() {
        return doctorRepository.doctorCardiology();
    }

    @Override
    public List<DoctorsDTO> doctorCentralNervousSystem() {
        return doctorRepository.doctorCentralNervousSystem();
    }

    @Override
    public List<DoctorsDTO> doctorFertilityCenter() {
        return doctorRepository.doctorFertilityCenter();
    }

    @Override
    public List<DoctorsDTO> doctorMedicalExaminationDepartment() {
        return doctorRepository.doctorMedicalExaminationDepartment();
    }

    @Override
    public List<DoctorsDTO> doctorOrthopedicDepartment() {
        return doctorRepository.doctorOrthopedicDepartment();
    }

    @Override
    public List<DoctorsDTO> doctorOtorhinolaryngology() {
        return doctorRepository.doctorOtorhinolaryngology();
    }

    @Override
    public List<DoctorsDTO> doctorPediatricsDepartment() {
        return doctorRepository.doctorPediatricsDepartment();
    }

    @Override
    public List<DoctorsDTO> doctorPharmacyDepartment() {
        return doctorRepository.doctorPharmacyDepartment();
    }

    @Override
    public List<DoctorsDTO> doctorRespiratoryMedicine() {
        return doctorRepository.doctorRespiratoryMedicine();
    }

    @Override
    public List<DoctorsDTO> doctorTestingCenter() {
        return doctorRepository.doctorTestingCenter();
    }

    @Override
    public List<DoctorsDTO> doctorVaccinationCenter() {
        return doctorRepository.doctorVaccinationCenter();
    }

    @Override
    public List<DoctorsDTO> doctorTrainingAndResearchCenter() {
        return doctorRepository.doctorTrainingAndResearchCenter();
    }
}
