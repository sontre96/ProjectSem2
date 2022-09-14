package com.example.projectsem2.HomeController;

import com.example.projectsem2.Admin.AdminService;
import com.example.projectsem2.Admin.TblAdmin;
import com.example.projectsem2.AppointmentSchedule.AppointmentSchedule;
import com.example.projectsem2.AppointmentSchedule.AppointmentScheduleService;
import com.example.projectsem2.Common.Constants;
import com.example.projectsem2.Contact.ContactService;
import com.example.projectsem2.Contact.TblContact;
import com.example.projectsem2.ExaminationPrice.ExaminationPrice;
import com.example.projectsem2.ExaminationPrice.ExaminationPriceService;
import com.example.projectsem2.ExaminationTime.ExaminationTime;
import com.example.projectsem2.ExaminationTime.ExaminationTimeService;
import com.example.projectsem2.Role.Role;
import com.example.projectsem2.Role.RoleService;
import com.example.projectsem2.Specialty.SpecialtyService;
import com.example.projectsem2.Specialty.TblSpecialty;
import com.example.projectsem2.payload.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class HomeController {
    @Autowired
    AppointmentScheduleService appointmentScheduleService;
    
    @Autowired
    ContactService contactService;

    @Autowired
    AdminService adminService;

    @Autowired
    RoleService roleService;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    SpecialtyService specialtyService;
    @Autowired
    ExaminationTimeService examinationTimeService;
    @Autowired
    ExaminationPriceService examinationPriceService;


    @GetMapping(value={"/", "/index", "/home"})
    public String viewHomePage() {
        return "index";
    }

    @GetMapping(value = "/home/introduce")
    public String viewIntroducePage() {
        return "introduce";
    }

    @GetMapping(value = "/home/specialty")
    public String viewSpecialtyPage() {
        return "specialty";
    }

    @GetMapping(value = "/home/booking")
    public String viewBookingPage(Model model) {
        return "booking";
    }

    @GetMapping(value = "/home/contact")
    public String viewContactPage() {
        return "contact";
    }

    @GetMapping(value = "/home/thankContact")
    public String viewThankContactPage() {
        return "thankContact";
    }


    //save user booking
    @PostMapping(value = "/saveAppointmentScheduleInfo")
    public ModelAndView saveUserBooking(@ModelAttribute AppointmentSchedule appointmentScheduleInfo)
    {
        System.out.println("AppointmentScheduleInfo from UI = " + appointmentScheduleInfo);
        appointmentScheduleService.saveAppointmentSchedule(appointmentScheduleInfo);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("appointmentSchedule_information");
        modelAndView.addObject("appointmentScheduleInfo", appointmentScheduleInfo);
        return modelAndView;
    }

    //save contact
    @PostMapping(value = "/saveContactInfo")
    public String saveContactInfo(@ModelAttribute("contactInfo") TblContact contactInfo) {
        contactService.saveContactInfo(contactInfo);
        return "redirect:/home/thankContact";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage(Model model) {
        return "register";
    }


    @RequestMapping(value = "/registerSubmit", method = RequestMethod.POST)
    public String registerSubmit(@ModelAttribute RegisterUser registerUser) {
        if(adminService.exitsByUserName(registerUser.getUsername())) {
            //Co ton tai username
            System.out.println("your username already exists");
            return "register";
        } else {
            //Chua ton tai username
            TblAdmin admin = new TblAdmin();
            admin.setUsername(registerUser.getUsername());
            admin.setEmail(registerUser.getEmail());
            String password = encoder.encode(registerUser.getPassword());
            admin.setPassword(password);

            Set<Role> roles = new HashSet<Role>();
            Role role = roleService.findByName(Constants.ROLE_ADMIN).get();
            roles.add(role);

            admin.setRoles(roles);

            adminService.saveAdmin(admin);
        }
        return "login";
    }

    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logoutSuccessful";
    }
}
