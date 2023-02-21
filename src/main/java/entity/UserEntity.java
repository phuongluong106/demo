package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "User")
@Setter
@Getter
public class UserEntity {
    @Id
    private Integer id;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "PASS_WORD")
    private String passWord;
    @ManyToMany
    @JoinTable(
            name = "USER_APPOINTMENT",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "APPOINTMENT_ID"))
    private Set<AppointmentEntity> appointments;
    @Column(name = "NUMBERS_OF_BOOKINGS")
    private Integer numbersOfBookings;
}
