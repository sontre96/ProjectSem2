package com.example.projectsem2.Doctor;

import com.example.projectsem2.Specialty.SpecialtyService;
import com.example.projectsem2.Specialty.TblSpecialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @Autowired
    private SpecialtyService specialtyService;

    private static final String UPLOADED_FOLDER= "src/main/resources/static/uploads/";

    //get all
    @GetMapping("/doctors/doctors")
    public String listDoctor(Model model){
        List<TblDoctor> doctors = doctorService.getAllDoctor();
        model.addAttribute("doctors",doctors);
        return "doctors/doctors";
    }

    @GetMapping("/showDoctorForm")
    // to form add
    public String showNewDoctorForm(Model model) {
        List<TblSpecialty> listSpecialties = specialtyService.getAllSpecialty();

        model.addAttribute("doctors", new TblDoctor());
        model.addAttribute("listSpecialties", listSpecialties);
        return "doctors/newDoctor";
    }

    //save avatar doctor
    @PostMapping(path = "/saveDoctor")
    public String saveDoctor(@Valid TblDoctor doctors, BindingResult result,
                             @RequestParam("avatar") MultipartFile myFile) {
        doctors.setAvatar("_");
        try {
            Path path = Paths.get(UPLOADED_FOLDER + myFile.getOriginalFilename());
            Files.write(path, myFile.getBytes());

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        doctors.setAvatar("/uploads/" + myFile.getOriginalFilename());
        doctorService.saveDoctor(doctors);
        return "redirect:/doctors/doctors";
    }

    @GetMapping("/showFormUpdateDoctor/{id}")
    public String showFormForUpdateDoctor(@PathVariable(value = "id") long id, Model model) {
        //get doctor the service
        TblDoctor doctors = doctorService.findDoctorById(id);
        //set admin as a model attribute to pre-populate the form
        model.addAttribute("doctors", doctors);
        List<TblSpecialty> ListSpecialties = specialtyService.getAllSpecialty();
        model.addAttribute("ListSpecialties",ListSpecialties);
        return "doctors/updateDoctor";
    }

    //update avatar admin
    @RequestMapping(value = {"/showFormUpdateDoctor/{id}"}, method = RequestMethod.POST, consumes = {"multipart/form-data"})
    public String showFormForUpdateDoctor(@PathVariable(value = "id") long id, @Valid TblDoctor doctors,
                                         BindingResult result,
                                         @RequestParam("avatarnew") MultipartFile myFile){
        if (!myFile.getOriginalFilename().equals("")){
            try {
                Path path = Paths.get(UPLOADED_FOLDER + myFile.getOriginalFilename());
                Files.write(path, myFile.getBytes());
                doctors.setAvatar("/uploads/" + myFile.getOriginalFilename());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        doctors.setId(id);
        doctorService.saveDoctor(doctors);
        return "redirect:/doctors/doctors";
    }

    //delete
    @GetMapping("/deleteDoctor/{id}")
    public String deleteDoctor(@PathVariable(value = "id") long id) {
        //call delete employee method
        this.doctorService.deleteDoctor(id);
        return "redirect:/doctors/doctors";
    }

    //count doctor
    @GetMapping("/doctors/countDoctor")
    public String countDoctor(Model model){
        model.addAttribute("countDoctor",doctorService.CountDoctorByName());
        return "doctors/countDoctor";
    }

    //search doctors in  cardiology Department
    @GetMapping("/doctors/doctorsCardiology")
    public String doctorsCardiology(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorCardiology());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  department of central nervous system
    @GetMapping("/doctors/doctorsCentralNervousSystem")
    public String doctorsCentralNervousSystem(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorCentralNervousSystem());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  FertilityCenter
    @GetMapping("/doctors/doctorsFertilityCenter")
    public String doctorsFertilityCenter(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorFertilityCenter());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  MedicalExaminationDepartment
    @GetMapping("/doctors/doctorsMedicalExaminationDepartment")
    public String doctorsMedicalExaminationDepartment(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorMedicalExaminationDepartment());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  OrthopedicDepartment
    @GetMapping("/doctors/doctorsOrthopedicDepartment")
    public String doctorsOrthopedicDepartment(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorOrthopedicDepartment());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  Otorhinolaryngology
    @GetMapping("/doctors/doctorsOtorhinolaryngology")
    public String doctorsOtorhinolaryngology(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorOtorhinolaryngology());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  Pediatrics Department
    @GetMapping("/doctors/doctorsPediatricsDepartment")
    public String doctorsPediatricsDepartment(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorPediatricsDepartment());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  Pharmacy Department
    @GetMapping("/doctors/doctorsPharmacyDepartment")
    public String doctorsPharmacyDepartment(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorPharmacyDepartment());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  Respiratory Medicine
    @GetMapping("/doctors/doctorsRespiratoryMedicine")
    public String doctorsRespiratoryMedicine(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorRespiratoryMedicine());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  Testing Center
    @GetMapping("/doctors/doctorsTestingCenter")
    public String doctorsTestingCenter(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorTestingCenter());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  Vaccination Center
    @GetMapping("/doctors/doctorsVaccinationCenter")
    public String doctorsVaccinationCenter(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorVaccinationCenter());
        return "doctors/doctorsDepartment";
    }

    //search doctors in  Training And Research Center
    @GetMapping("/doctors/doctorsTrainingAndResearchCenter")
    public String doctorsTrainingAndResearchCenter(Model model){
        model.addAttribute("doctorsDepartment", doctorService.doctorTrainingAndResearchCenter());
        return "doctors/doctorsDepartment";
    }
}
