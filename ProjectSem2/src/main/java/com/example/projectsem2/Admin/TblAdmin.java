package com.example.projectsem2.Admin;

import com.example.projectsem2.Role.Role;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_admin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TblAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "gender")
    private boolean gender;
    @Column(name = "address")
    private String address;
    @Column(name = "user_name")
    @NotEmpty(message = "username is mandatory")
    @Size(min = 6, message = "username should have at least 6 characters")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    @NotEmpty(message = "password is mandatory")
    @Size(min = 6, message = "password should have at least 6 characters")
    private String password;
    @Basic
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", updatable = true)
    @UpdateTimestamp
    private Date updatedAt;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(	name = "admins_roles",
            joinColumns = @JoinColumn(name = "admin_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
}
