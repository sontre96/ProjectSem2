package com.example.projectsem2.HomeController;

import com.example.projectsem2.Admin.AdminService;
import com.example.projectsem2.Admin.TblAdmin;
import com.example.projectsem2.AppointmentSchedule.AppointmentSchedule;
import com.example.projectsem2.AppointmentSchedule.AppointmentScheduleService;
import com.example.projectsem2.Common.Constants;
import com.example.projectsem2.Contact.ContactService;
import com.example.projectsem2.Contact.TblContact;
import com.example.projectsem2.Role.Role;
import com.example.projectsem2.Role.RoleService;
import com.example.projectsem2.payload.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
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
    public String viewBookingPage() {
        return "booking";
    }

    @GetMapping(value = "/home/contact")
    public String viewContactPage() {
        return "contact";
    }

    @GetMapping(value = "/home/thankBooking")
    public String viewThankBookingPage() {
        return "thankBooking";
    }

    @GetMapping(value = "/home/thankContact")
    public String viewThankContactPage() {
        return "thankContact";
    }

    //save user booking
    @PostMapping(value = "/saveAppointmentScheduleInfo")
    public String saveUserInfo(@ModelAttribute("appointmentScheduleInfo") AppointmentSchedule appointmentScheduleInfo) {
        appointmentScheduleService.saveAppointmentScheduleInfo(appointmentScheduleInfo);
        return "redirect:/home/thankBooking";
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
