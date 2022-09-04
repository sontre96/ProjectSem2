package com.example.projectsem2.ExaminationTime;

import com.example.projectsem2.ExaminationPrice.ExaminationPrice;
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
public class ExaminationTimeController {
    @Autowired
    ExaminationTimeService examinationTimeService;

    //get all
    @GetMapping("/examinationTimes/examinationTimes")
    public String listExaminationTimes(Model model){
        List<ExaminationTime> examinationTimes = examinationTimeService.getAllExaminationTime();
        model.addAttribute("examinationTimes",examinationTimes);
        return "examinationTimes/examinationTimes";
    }

    // to form add
    @GetMapping("/showNewExaminationTimeForm")
    public String showNewExaminationTimeForm(Model model) {
        // create model attribute to bind form data
        ExaminationTime examinationTimes = new ExaminationTime();
        model.addAttribute("examinationTimes", examinationTimes);
        return "examinationTimes/newExaminationTime";
    }

    //save
    @PostMapping("/saveExaminationTime")
    public String saveExaminationTime(@ModelAttribute("examinationTimes")
                                          @Valid ExaminationTime examinationTimes, BindingResult result) {
        if (result.hasErrors()) {
            return "examinationTimes/newExaminationTime";
        }
        examinationTimeService.saveExaminationTime(examinationTimes);
        return "redirect:/examinationTimes/examinationTimes";
    }

    //Update
    @GetMapping("/showFormUpdateExaminationTime/{id}")
    public String showFormForUpdateExaminationTime(@PathVariable(value = "id") long id, Model model) {
        //get contact the service
        ExaminationTime examinationTimes = examinationTimeService.getExaminationTimeById(id);
        //set contact as a model attribute to pre-populate the form
        model.addAttribute("examinationTimes", examinationTimes);
        return "examinationTimes/updateExaminationTime";
    }

    //delete
    @GetMapping("/deleteExaminationTime/{id}")
    public String deleteExaminationTime(@PathVariable (value = "id") long id) {
        //call delete contact method
        this.examinationTimeService.deleteExaminationTime(id);
        return "redirect:/examinationTimes/examinationTimes";
    }
}
