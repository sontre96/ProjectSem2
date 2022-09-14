package com.example.projectsem2.ExaminationSchedule;

import com.example.projectsem2.ExaminationDay.ExaminationDay;
import com.example.projectsem2.Specialty.TblSpecialty;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "examination_schedule")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExaminationSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    @Column(name = "slot")
    private int slot;
    @Basic
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", updatable = true)
    @UpdateTimestamp
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "specialty_id", insertable = true, updatable = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @NotNull(message = "can't delete")
    private TblSpecialty specialtyId;

    @ManyToOne
    @JoinColumn(name = "examination_day_id", insertable = true, updatable = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @NotNull(message = "can't delete")
    private ExaminationDay examinationDayId;
}
