package models;

import behaviours.Playable;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class Competition implements Playable {

    private int id;
    private String name;
    private Set<models.Team> teams;
    private Result result;
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;

    public Competition() {
    }

    public Competition(String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        this.name = name;
        this.teams = new HashSet<models.Team>();
        this.startDate = startDate;
        this.endDate = endDate;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<models.Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate) {
        this.endDate = endDate;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public int getNumberOfTeams() {
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
