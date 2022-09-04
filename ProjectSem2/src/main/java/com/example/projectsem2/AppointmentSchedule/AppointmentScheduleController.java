package com.example.projectsem2.AppointmentSchedule;

import com.example.projectsem2.ExaminationPrice.ExaminationPrice;
import com.example.projectsem2.ExaminationPrice.ExaminationPriceService;
import com.example.projectsem2.ExaminationTime.ExaminationTime;
import com.example.projectsem2.ExaminationTime.ExaminationTimeService;
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
public class AppointmentScheduleController {
    @Autowired
    AppointmentScheduleService appointmentScheduleService;
    @Autowired
    SpecialtyService specialtyService;
    @Autowired
    ExaminationTimeService examinationTimeService;
    @Autowired
    ExaminationPriceService examinationPriceService;

    //get all
    @GetMapping("/appointmentSchedules/appointmentSchedules")
    public String listAppointmentSchedules(Model model){
        List<AppointmentSchedule> appointmentSchedules = appointmentScheduleService.getAllAppointmentSchedule();
        model.addAttribute("appointmentSchedules",appointmentSchedules);
        return "appointmentSchedules/appointmentSchedules";
    }

    // to form add
    @GetMapping("/showNewAppointmentScheduleForm")
    public String showNewAppointmentScheduleForm(Model model) {
        List<TblSpecialty> listSpecialties = specialtyService.getAllSpecialty();
        List<ExaminationTime> ListExaminationTimes = examinationTimeService.getAllExaminationTime();
        List<ExaminationPrice> listExaminationPrices = examinationPriceService.getAllExaminationPrice();

        model.addAttribute("appointmentSchedules", new AppointmentSchedule());
        model.addAttribute("listSpecialties", listSpecialties);
        model.addAttribute("ListExaminationTimes",ListExaminationTimes);
        model.addAttribute("listExaminationPrices",listExaminationPrices);
        return "appointmentSchedules/newAppointmentSchedule";
    }

    //save
    @PostMapping("/saveAppointmentSchedule")
    public String saveAppointmentSchedule(@ModelAttribute("appointmentSchedules")
                                              AppointmentSchedule appointmentSchedules) {
        appointmentScheduleService.saveAppointmentSchedule(appointmentSchedules);
        return "redirect:/appointmentSchedules/appointmentSchedules";
    }

    //Update
    @GetMapping("/showFormUpdateAppointmentSchedule/{id}")
    public String showFormForUpdateAppointmentSchedule(@PathVariable(value = "id") long id, Model model) {
        AppointmentSchedule appointmentSchedules = appointmentScheduleService.getAppointmentScheduleById(id);
        model.addAttribute("appointmentSchedules", appointmentSchedules);
        //set appointment Schedule as a model attribute to pre-populate the form
        List<TblSpecialty> listSpecialties = specialtyService.getAllSpecialty();
        model.addAttribute("listSpecialties", listSpecialties);
        List<ExaminationTime> ListExaminationTimes = examinationTimeService.getAllExaminationTime();
        model.addAttribute("ListExaminationTimes", ListExaminationTimes);
        List<ExaminationPrice> listExaminationPrices = examinationPriceService.getAllExaminationPrice();
        model.addAttribute("listExaminationPrices",listExaminationPrices);
        return "appointmentSchedules/updateAppointmentSchedule";
    }

    //delete
    @GetMapping("/deleteAppointmentSchedule/{id}")
    public String deleteAppointmentSchedule(@PathVariable (value = "id") long id) {
        this.appointmentScheduleService.deleteAppointmentSchedule(id);
        return "redirect:/appointmentSchedules/appointmentSchedules";
    }

    //count appointmentSchedule
    @GetMapping("/appointmentSchedules/countAppointmentSchedule")
    public String countDoctor(Model model){
        model.addAttribute("countAppointmentSchedule", appointmentScheduleService.countAppointmentSchedule());
        return "appointmentSchedules/countAppointmentSchedule";
    }
}
