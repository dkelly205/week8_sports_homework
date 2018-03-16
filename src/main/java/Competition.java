import java.util.GregorianCalendar;
import java.util.Set;

public abstract class Competition {

    private int id;
    private String name;
    private Set<Team> teams;
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;

    public Competition() {
    }

    public Competition(String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        this.name = name;
        this.teams = teams;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public Set<Team> getTeams() {
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

    public abstract void playGame(Team team1, Team team2);

}
