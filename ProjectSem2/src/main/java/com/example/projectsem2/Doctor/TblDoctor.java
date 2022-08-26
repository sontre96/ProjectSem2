package com.example.projectsem2.Doctor;

import com.example.projectsem2.Specialty.TblSpecialty;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_doctor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TblDoctor {
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
    @Column(name = "status")
    private boolean status;
    @Basic
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", updatable = true)
    @UpdateTimestamp
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "specialty_id", insertable = true, updatable = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private TblSpecialty specialtyId;
}
