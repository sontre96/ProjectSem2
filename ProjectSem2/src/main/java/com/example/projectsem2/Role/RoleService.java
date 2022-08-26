package com.example.projectsem2.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    Optional<Role> findByName(String name);

    List<Role> getAllRole();
}