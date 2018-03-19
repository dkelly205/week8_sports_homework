package models;

import models.Manager;
import models.Player;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="teams")
public class Team {

    private int id;
    private String name;
    private int points;
    private Manager manager;
    private Set<Player> players;
    private int squadLimit;
    private Set<Competition> competitions;

    public Team() {
    }

    public Team(String name, Manager manager, int squadLimit) {
        this.name = name;
        this.manager = manager;
        this.points = 0;
        this.players = new HashSet<Player>();
        this.squadLimit = squadLimit;
        this.competitions = new HashSet<Competition>();
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

    @Column(name="points")
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @OneToOne(fetch = FetchType.EAGER)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    @Column(name="squad_limit")
    public int getSquadLimit() {
        return squadLimit;
    }

    public void setSquadLimit(int squadLimit) {
        this.squadLimit = squadLimit;
    }

    @ManyToMany(mappedBy = "teams", fetch = FetchType.EAGER)
    public Set<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(Set<Competition> competitions) {
        this.competitions = competitions;
    }

    public int numberOfPlayers() {
        return players.size();
    }

    public void addPlayer(Player player) {
        if(numberOfPlayers() < squadLimit) {
            players.add(player);
        }
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public void addPoints(Result result){
        points += result.getValue();
    }

}
