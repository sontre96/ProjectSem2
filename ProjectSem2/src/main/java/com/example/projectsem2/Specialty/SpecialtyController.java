package com.example.projectsem2.Specialty;

import com.example.projectsem2.Contact.TblContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SpecialtyController {
    @Autowired
    SpecialtyService specialtyService;

    //get all
    @GetMapping("/specialties/specialties")
    public String listSpecialties(Model model){
        List<TblSpecialty> specialties = specialtyService.getAllSpecialty();
        model.addAttribute("specialties",specialties);
        return "specialties/specialties";
    }

    // to form add
    @GetMapping("/showNewSpecialtyForm")
    public String showNewSpecialtyForm(Model model) {
        // create model attribute to bind form data
        TblSpecialty specialties = new TblSpecialty();
        model.addAttribute("specialties", specialties);
        return "specialties/newSpecialty";
    }

    //save
    @PostMapping("/saveSpecialty")
    public String saveContact(@ModelAttribute("specialties") @Valid TblSpecialty specialties, BindingResult result) {
        if (result.hasErrors()) {
            return "specialties/newSpecialty";
        }
        //save specialty database
        specialtyService.saveSpecialty(specialties);
        return "redirect:/specialties/specialties";
    }

    //Update
    @GetMapping("/showFormUpdateSpecialty/{id}")
    public String showFormForUpdateSpecialty(@PathVariable(value = "id") long id, Model model) {
        //get contact the service
        TblSpecialty specialties = specialtyService.getSpecialtyById(id);
        //set contact as a model attribute to pre-populate the form
        model.addAttribute("specialties", specialties);
        return "specialties/updateSpecialty";
    }

    //delete
    @GetMapping("/deleteSpecialty/{id}")
    public String deleteContact(@PathVariable (value = "id") long id) {
        //call delete contact method
        this.specialtyService.deleteSpecialty(id);
        return "redirect:/specialties/specialties";
    }
}
