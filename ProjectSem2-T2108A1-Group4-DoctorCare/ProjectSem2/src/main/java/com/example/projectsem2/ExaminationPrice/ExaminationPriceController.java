package com.example.projectsem2.ExaminationPrice;

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
public class ExaminationPriceController {
    @Autowired
    ExaminationPriceService examinationPriceService;

    //get all
    @GetMapping("/examinationPrices/examinationPrices")
    public String listExaminationPrices(Model model){
        List<ExaminationPrice> examinationPrices = examinationPriceService.getAllExaminationPrice();
        model.addAttribute("examinationPrices",examinationPrices);
        return "examinationPrices/examinationPrices";
    }

    // to form add
    @GetMapping("/showNewExaminationPriceForm")
    public String showNewExaminationPriceForm(Model model) {
        // create model attribute to bind form data
        ExaminationPrice examinationPrices = new ExaminationPrice();
        model.addAttribute("examinationPrices", examinationPrices);
        return "examinationPrices/newExaminationPrice";
    }

    //save
    @PostMapping("/saveExaminationPrice")
    public String saveExaminationPrice(@ModelAttribute("examinationPrices")
                                           @Valid ExaminationPrice examinationPrices, BindingResult result) {
        if (result.hasErrors()) {
            return "examinationPrices/newExaminationPrice";
        }

        examinationPriceService.saveExaminationPrice(examinationPrices);
        return "redirect:/examinationPrices/examinationPrices";
    }

    //Update
    @GetMapping("/showFormUpdateExaminationPrice/{id}")
    public String showFormForUpdateExaminationPrice(@PathVariable(value = "id") long id, Model model) {
        //get contact the service
        ExaminationPrice examinationPrices = examinationPriceService.getExaminationPriceById(id);
        //set contact as a model attribute to pre-populate the form
        model.addAttribute("examinationPrices", examinationPrices);
        return "examinationPrices/updateExaminationPrice";
    }

    //delete
    @GetMapping("/deleteExaminationPrice/{id}")
    public String deleteExaminationPrice(@PathVariable (value = "id") long id) {
        //call delete contact method
        this.examinationPriceService.deleteExaminationPrice(id);
        return "redirect:/examinationPrices/examinationPrices";
    }
}
