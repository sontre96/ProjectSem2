package com.example.projectsem2.Contact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "tbl_contact")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TblContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    @NotEmpty(message = "name is mandatory")
    private String name;
    @NotEmpty(message = "phone is mandatory")
    @Size(max = 10, min = 10, message = "phone number must have 10 digits and starts with 0")
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    @NotEmpty(message = "email is mandatory")
    @Email(message = "Email invalidate")
    private String email;
    @Column(name = "note")
    @NotEmpty(message = "note is mandatory")
    private String note;
    @Basic
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", updatable = true)
    @UpdateTimestamp
    private Date updatedAt;

}
