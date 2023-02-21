package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "USER_APPOINTMENT")
@Getter
@Setter
public class UserAppointmentEntity {
    @Id
    private Integer Id;
    @Column(name = "USER_ID")
    private Integer userId;
    @Column(name = "APPOINTMENT_ID")
    private Integer appointmentId;
}
