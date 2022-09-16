package com.example.projectsem2.ExaminationPrice;


import com.example.projectsem2.AppointmentSchedule.AppointmentSchedule;
import com.example.projectsem2.ExaminationSchedule.ExaminationSchedule;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "examination_price")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExaminationPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    @NotEmpty(message = "name is mandatory")
    private String name;
    @Basic
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", updatable = true)
    @UpdateTimestamp
    private Date updatedAt;

    @OneToMany(mappedBy = "examinationPriceId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<AppointmentSchedule> appointmentSchedules;
}
