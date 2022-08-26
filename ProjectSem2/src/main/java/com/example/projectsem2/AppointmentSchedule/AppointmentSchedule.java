package com.example.projectsem2.AppointmentSchedule;

import com.example.projectsem2.ExaminationPrice.ExaminationPrice;
import com.example.projectsem2.ExaminationTime.ExaminationTime;
import com.example.projectsem2.Specialty.TblSpecialty;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
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
    private String name;
    @Column(name = "phone")
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

    @ManyToOne
    @JoinColumn(name = "specialty_id", insertable = true, updatable = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private TblSpecialty specialtyId;

    @ManyToOne
    @JoinColumn(name = "examination_time_id", insertable = true, updatable = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ExaminationTime examinationTimeId;

    @ManyToOne
    @JoinColumn(name = "examination_price_id", insertable = true, updatable = true)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ExaminationPrice examinationPriceId;

}
