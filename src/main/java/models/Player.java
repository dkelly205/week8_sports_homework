package models;

import models.Employee;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player extends Employee {

    private Team team;

    public Player() {
    }

    public Player(String name, Team team) {
        super(name);
        this.team = team;
    }

    @ManyToOne
    @JoinColumn(name="team_id", nullable = false)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


}
