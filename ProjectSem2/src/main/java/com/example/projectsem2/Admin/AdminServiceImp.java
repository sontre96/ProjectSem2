package com.example.projectsem2.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImp implements AdminService {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public List<TblAdmin> getAllAdmin() {
        return adminRepository.findAllByOrderByIdAsc();
    }

    @Override
    public TblAdmin saveAdmin(TblAdmin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    @Override
    public TblAdmin findAdminById(Long id) {
        Optional<TblAdmin> optionalAdmin = adminRepository.findById(id);
        TblAdmin admin = null;
        if (optionalAdmin.isPresent()) {
            admin = optionalAdmin.get();
        }else {
            throw new RuntimeException("Admin not found for id : "+id);
        }
        return admin;
    }

    @Override
    public TblAdmin getOne(Long id) {
        return adminRepository.findById(id).get();
    }

    @Override
    public List<TblAdmin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public Boolean exitsByUserName(String username) {
        return adminRepository.existsByUsername(username);
    }
}
