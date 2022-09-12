package com.example.projectsem2.ExaminationSchedule;

import com.example.projectsem2.ExaminationDay.ExaminationDay;
import com.example.projectsem2.ExaminationDay.ExaminationDayService;
import com.example.projectsem2.Specialty.SpecialtyService;
import com.example.projectsem2.Specialty.TblSpecialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ExaminationScheduleController {
    @Autowired
    ExaminationScheduleService examinationScheduleService;
    @Autowired
    SpecialtyService specialtyService;
    @Autowired
    ExaminationDayService examinationDayService;

    //get all
    @GetMapping("/examinationSchedules/examinationSchedules")
    public String listExaminationSchedules(Model model){
        List<ExaminationSchedule> examinationSchedules = examinationScheduleService.getAllExaminationSchedule();
        model.addAttribute("examinationSchedules",examinationSchedules);
        return "examinationSchedules/examinationSchedules";
    }

    // to form add
    @GetMapping("/showNewExaminationScheduleForm")
    public String showNewExaminationScheduleForm(Model model) {
        List<TblSpecialty> listSpecialties = specialtyService.getAllSpecialty();
        List<ExaminationDay> ListExaminationDays = examinationDayService.getAllExaminationDay();

        model.addAttribute("examinationSchedules", new ExaminationSchedule());
        model.addAttribute("listSpecialties", listSpecialties);
        model.addAttribute("ListExaminationDays", ListExaminationDays);
        return "examinationSchedules/newExaminationSchedule";
    }

    //save
    @PostMapping("/saveExaminationSchedule")
    public String saveExaminationSchedule(@ModelAttribute("examinationSchedules") ExaminationSchedule examinationSchedules) {
        examinationScheduleService.saveExaminationSchedule(examinationSchedules);
        return "redirect:/examinationSchedules/examinationSchedules";
    }

    //Update
    @GetMapping("/showFormUpdateExaminationSchedule/{id}")
    public String showFormForUpdateExaminationSchedule(@PathVariable(value = "id") long id, Model model) {
        ExaminationSchedule examinationSchedules = examinationScheduleService.getExaminationScheduleById(id);
        model.addAttribute("examinationSchedules", examinationSchedules);
       List<TblSpecialty> listSpecialties = specialtyService.getAllSpecialty();
       model.addAttribute("listSpecialties", listSpecialties);
       List<ExaminationDay> ListExaminationDays = examinationDayService.getAllExaminationDay();
       model.addAttribute("ListExaminationDays", ListExaminationDays);
        return "examinationSchedules/updateExaminationSchedule";
    }

    //delete
    @GetMapping("/deleteExaminationSchedule/{id}")
    public String deleteExaminationSchedule(@PathVariable (value = "id") long id) {
        //call delete contact method
        this.examinationScheduleService.deleteExaminationSchedule(id);
        return "redirect:/examinationSchedules/examinationSchedules";
    }
}
