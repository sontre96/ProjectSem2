package com.example.projectsem2.Admin;

import com.example.projectsem2.Doctor.TblDoctor;

import java.util.List;

public interface AdminService {
    List<TblAdmin> getAllAdmin();

    TblAdmin saveAdmin(TblAdmin admin);

    void deleteAdmin(Long id);

    TblAdmin findAdminById(Long id);

    public TblAdmin getOne(Long id);

    List<TblAdmin> findAll();

    Boolean exitsByUserName(String username);
}
