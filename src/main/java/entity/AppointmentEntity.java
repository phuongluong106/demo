package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "APPOINTMENT")
@Setter
@Getter
public class AppointmentEntity {
    @Id
    private Integer Id;
    @Column(name = "PEOPLE_SIZE")
    private Integer peopleSize;
    @Column(name = "APPOINTMENT_TYPE")
    private String appointmentType;
    @Column(name = "START_TIME")
    private LocalDateTime startTime;
    @Column(name = "END_TIME")
    private LocalDateTime endTime;
    @ManyToMany
    @JoinTable(
            name = "USER_APPOINTMENT",
            joinColumns = @JoinColumn(name = "APPOINTMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    private Set<UserEntity> users;
}
