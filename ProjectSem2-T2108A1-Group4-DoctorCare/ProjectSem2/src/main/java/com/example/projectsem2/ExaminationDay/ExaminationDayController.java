package com.example.projectsem2.ExaminationDay;

import com.example.projectsem2.ExaminationTime.ExaminationTime;
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
public class ExaminationDayController {
    @Autowired
    ExaminationDayService examinationDayService;

    //get all
    @GetMapping("/examinationDays/examinationDays")
    public String listExaminationDays(Model model){
        List<ExaminationDay> examinationDays = examinationDayService.getAllExaminationDay();
        model.addAttribute("examinationDays",examinationDays);
        return "examinationDays/examinationDays";
    }

    // to form add
    @GetMapping("/showNewExaminationDayForm")
    public String showNewExaminationDayForm(Model model) {
        // create model attribute to bind form data
        ExaminationDay examinationDays = new ExaminationDay();
        model.addAttribute("examinationDays", examinationDays);
        return "examinationDays/newExaminationDay";
    }

    //save
    @PostMapping("/saveExaminationDay")
    public String saveExaminationDay(@ModelAttribute("examinationDays")
                                      @Valid ExaminationDay examinationDays, BindingResult result) {
        if (result.hasErrors()) {
            return "examinationDays/newExaminationDay";
        }
        examinationDayService.saveExaminationDay(examinationDays);
        return "redirect:/examinationDays/examinationDays";
    }

    //Update
    @GetMapping("/showFormUpdateExaminationDay/{id}")
    public String showFormForUpdateExaminationDay(@PathVariable(value = "id") long id, Model model) {
        //get contact the service
        ExaminationDay examinationDays = examinationDayService.getExaminationDayById(id);
        //set contact as a model attribute to pre-populate the form
        model.addAttribute("examinationDays", examinationDays);
        return "examinationDays/updateExaminationDay";
    }

    //delete
    @GetMapping("/deleteExaminationDay/{id}")
    public String deleteExaminationDay(@PathVariable (value = "id") long id) {
        //call delete contact method
        this.examinationDayService.deleteExaminationDay(id);
        return "redirect:/examinationDays/examinationDays";
    }
}
