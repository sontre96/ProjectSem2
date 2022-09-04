package com.example.projectsem2.AppointmentSchedule;

import com.example.projectsem2.ExaminationPrice.ExaminationPrice;
import com.example.projectsem2.ExaminationTime.ExaminationTime;
import com.example.projectsem2.Specialty.TblSpecialty;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "appointment_schedule")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    @NotEmpty(message = "name is mandatory")
    private String name;
    @Column(name = "phone")
    @NotEmpty(message = "phone is mandatory")
    @Size(max = 10, min = 10, message = "phone number must have 10 digits")
    private String phone;
    @Column(name = "order_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @Column(name = "order_status")
    private String orderStatus;
    @Basic
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", updatable = true)
    @UpdateTimestamp
    private Date updatedAt;

    @Basic
    @Column(name = "specialty_id", insertable = false, updatable = false)
    private Long specialtiesId;

    @Basic
    @Column(name = "examination_time_id", insertable = false, updatable = false)
    private Long TimeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialty_id", insertable = true, updatable = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private TblSpecialty specialtyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "examination_time_id", insertable = true, updatable = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ExaminationTime examinationTimeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "examination_price_id", insertable = true, updatable = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ExaminationPrice examinationPriceId;

}
