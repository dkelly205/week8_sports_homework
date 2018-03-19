package models;

import behaviours.Playable;

import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Competition implements Playable {

    private int id;
    private String name;
    private Set<models.Team> teams;
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;

    public Competition() {
    }

    public Competition(String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        this.name = name;
        this.teams = new HashSet<models.Team>();
        this.startDate = startDate;
        this.endDate = endDate;
        this.teams = new HashSet<Team>();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    @JoinTable(name = "competition_team",
            joinColumns = {@JoinColumn(name = "competition_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "team_id", nullable = false, updatable = false)})
    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    @Column(name="start_date")
    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    @Column(name="end_date")
    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate) {
        this.endDate = endDate;
    }

    public int numberOfTeams() {
        return teams.size();
    }

    public void addTeam(Team team){
        teams.add(team);
    }

    public Result randomResult(){
        int result = new Random().nextInt(Result.values().length);
        return Result.values()[result];
    }
}
