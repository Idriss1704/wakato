package net.ganemtore.wakato.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Team {
    @Id
    private Long id;
    private String name;
    private String description;
    @OneToOne
    private Employee leader;
    @OneToMany
    private List<Employee> members;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
