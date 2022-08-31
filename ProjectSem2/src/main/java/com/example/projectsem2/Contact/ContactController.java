package com.example.projectsem2.Contact;

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
public class ContactController {
    @Autowired
    ContactService contactService;

    //get all
    @GetMapping("/contacts/contacts")
    public String listContact(Model model){
        List<TblContact> contacts = contactService.getAllContact();
        model.addAttribute("contacts",contacts);
        return "contacts/contacts";
    }

    // to form add
    @GetMapping("/showNewContactForm")
    public String showNewContactForm(Model model) {
        // create model attribute to bind form data
        TblContact contacts = new TblContact();
        model.addAttribute("contacts", contacts);
        return "contacts/newContact";
    }

    //save
    @PostMapping("/saveContact")
    public String saveContact(@ModelAttribute("contacts")  @Valid TblContact contacts, BindingResult result) {
        if (result.hasErrors()) {
            return "contacts/newContact";
        }
        //save contact database
        contactService.saveContact(contacts);
        return "redirect:/contacts/contacts";
    }

    //Update
    @GetMapping("/showFormUpdateContact/{id}")
    public String showFormForUpdateContact(@PathVariable(value = "id") long id, Model model) {
        //get contact the service
        TblContact contacts = contactService.getContactById(id);
        //set contact as a model attribute to pre-populate the form
        model.addAttribute("contacts", contacts);
        return "contacts/updateContact";
    }

    //delete
    @GetMapping("/deleteContact/{id}")
    public String deleteContact(@PathVariable (value = "id") long id) {
        //call delete contact method
        this.contactService.deleteContact(id);
        return "redirect:/contacts/contacts";
    }
}
