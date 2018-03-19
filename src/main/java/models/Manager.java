package models;

import models.Employee;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="managers")
public class Manager extends Employee {
    private Team team;

    public Manager() {
    }

    public Manager(String name) {
        super(name);
    }


    @OneToOne(mappedBy = "manager", fetch = FetchType.EAGER)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
