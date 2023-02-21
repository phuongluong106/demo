package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "User")
@Setter
@Getter
public class NotificationEntity {
    @Id
    private Integer id;
    @Column(name = "APPOINTMENT_ID")
    private Integer appointmentId;
    @Column(name = "MESSAGE")
    private String message;
}
