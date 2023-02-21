package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "OFFICER_ROLE")
@Setter
@Getter
public class OfficerRoleEntity {
    @Id
    private Integer id;
    @Column(name = "ROLE")
    private String role;
}
