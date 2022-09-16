package com.example.projectsem2.AdminRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "admins_roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "admin_id")
    private Long adminId;
    @Basic
    @Column(name = "role_id")
    private Long roleId;
}