package com.example.projectsem2.Contact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
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
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "note")
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
