package com.example.projectsem2.Admin;

import com.example.projectsem2.Role.Role;
import com.example.projectsem2.Role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @Autowired
    private RoleService roleService;

    @Autowired
    PasswordEncoder encoder;

    private static final String UPLOADED_FOLDER= "src/main/resources/static/uploads/";

    //get all
    @GetMapping("/admins/admins")
    public String listAdmin(Model model){
        List<TblAdmin> admins = adminService.getAllAdmin();
        model.addAttribute("admins",admins);
        return "admins/admins";
    }

    @GetMapping("/showAdminForm")
    // to form add
    public String showNewAdminForm(Model model) {
        List<Role> ListRoles = roleService.getAllRole();
        model.addAttribute("admins", new TblAdmin());
        model.addAttribute("ListRoles",ListRoles);
        return "admins/newAdmin";
    }

    //save avatar doctor
    @PostMapping(path = "/saveAdmin")
    public String saveAdmin( TblAdmin admins, BindingResult result,
                              @RequestParam("avatar") MultipartFile myFile) {
        admins.setAvatar("_");
        try {
            Path path = Paths.get(UPLOADED_FOLDER + myFile.getOriginalFilename());
            Files.write(path, myFile.getBytes());

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        admins.setAvatar("/uploads/" + myFile.getOriginalFilename());
        adminService.saveAdmin(admins);
        return "redirect:/admins/admins";
    }

    @GetMapping("/showFormUpdateAdmin/{id}")
    public String showFormForUpdateAdmin(@PathVariable(value = "id") long id, Model model) {
        //get admin the service
        TblAdmin admin = adminService.findAdminById(id);
        //set admin as a model attribute to pre-populate the form
        model.addAttribute("admin", admin);

        List<Role> ListRoles = roleService.getAllRole();
        model.addAttribute("ListRoles",ListRoles);
        return "admins/updateAdmin";
    }

    //update avatar admin
    @RequestMapping(value = {"/showFormUpdateAdmin/{id}"}, method = RequestMethod.POST, consumes = {"multipart/form-data"})
    public String showFormForUpdateAdmin(@PathVariable(value = "id") long id,
                                         TblAdmin admins,
                                         BindingResult result,
                                         @RequestParam("avatarnew") MultipartFile myFile){
        if (!myFile.getOriginalFilename().equals("")){
            try {
                Path path = Paths.get(UPLOADED_FOLDER + myFile.getOriginalFilename());
                Files.write(path, myFile.getBytes());
                admins.setAvatar("/uploads/" + myFile.getOriginalFilename());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        admins.setPassword(encoder.encode(admins.getPassword()));
        adminService.saveAdmin(admins);
        return "redirect:/admins/admins";
    }


    //delete
    @GetMapping("/deleteAdmin/{id}")
    public String deleteAdmin(@PathVariable(value = "id") long id) {
        //call delete employee method
        this.adminService.deleteAdmin(id);
        return "redirect:/admins/admins";
    }
}
