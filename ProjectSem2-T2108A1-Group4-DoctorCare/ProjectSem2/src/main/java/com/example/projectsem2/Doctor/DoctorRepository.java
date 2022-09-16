package com.example.projectsem2.Doctor;

import com.example.projectsem2.dto.CountDoctor;
import com.example.projectsem2.dto.DoctorsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<TblDoctor, Long> {
    List<TblDoctor> findAllByOrderByIdAsc();

    //count doctor
    @Query("select new com.example.projectsem2.dto.CountDoctor (s.name, count(d.name) ) " +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id group by s.name")
    List<CountDoctor> CountDoctorByName();

    //search doctors in cardiology Department
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('cardiology Department')")
    List<DoctorsDTO> doctorCardiology();

    //search doctors in department of central nervous system
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('department of central nervous system')")
    List<DoctorsDTO> doctorCentralNervousSystem();

    //search doctors in Fertility Center
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('Fertility Center')")
    List<DoctorsDTO> doctorFertilityCenter();

    //search doctors in Medical Examination Department
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('Medical Examination Department')")
    List<DoctorsDTO> doctorMedicalExaminationDepartment();

    //search doctors in Orthopedic Department
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('Orthopedic Department')")
    List<DoctorsDTO> doctorOrthopedicDepartment();

    //search doctors in Otorhinolaryngology
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('Otorhinolaryngology')")
    List<DoctorsDTO> doctorOtorhinolaryngology();

    //search doctors in Pediatrics Department
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('Pediatrics Department')")
    List<DoctorsDTO> doctorPediatricsDepartment();

    //search doctors in Pharmacy Department
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('Pharmacy Department')")
    List<DoctorsDTO> doctorPharmacyDepartment();

    //search doctors in Respiratory Medicine
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('Respiratory Medicine')")
    List<DoctorsDTO> doctorRespiratoryMedicine();

    //search doctors in Testing Center
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('Testing Center')")
    List<DoctorsDTO> doctorTestingCenter();

    //search doctors in Vaccination Center
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('Vaccination Center')")
    List<DoctorsDTO> doctorVaccinationCenter();

    //search doctors in Training and Research Center
    @Query("select new com.example.projectsem2.dto.DoctorsDTO (d.name, d.gender, s.name, d.status)" +
            "from TblDoctor d inner join TblSpecialty s on d.specialtiesId = s.id where s.name like ('Training and Research Center')")
    List<DoctorsDTO> doctorTrainingAndResearchCenter();
}
