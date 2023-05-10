package net.ganemtore.wakato.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    private Long id;
    @OneToOne
    private User user;
    @ManyToOne
    private Organization organization;
    @ManyToOne
    private Role role;
    @ManyToOne
    private Team team;
    private Boolean active;
    private LocalDate startDate;
    private LocalDate endDate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
