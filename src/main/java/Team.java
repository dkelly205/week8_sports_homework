import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Team {

    private int id;
    private String name;
    private int points;
    private Manager manager;
    private Set<Player> players;
    private int squadLimit;
    private Result result;

    public Team() {
    }

    public Team(String name, Manager manager, int squadLimit) {
        this.name = name;
        this.manager = manager;
        this.points = 0;
        this.players = new HashSet<Player>();
        this.squadLimit = squadLimit;

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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public int getSquadLimit() {
        return squadLimit;
    }

    public void setSquadLimit(int squadLimit) {
        this.squadLimit = squadLimit;
    }

    public int getNumberOfPlayers() {
        return players.size();
    }

    public void addPlayer(Player player) {
        if(getNumberOfPlayers() < squadLimit) {
            players.add(player);
        }
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }


//    private Letter randomLetter() {
//        int pick = new Random().nextInt(Letter.values().length);
//        return Letter.values()[pick];
//    }

    public Result randomResult(){
        int result = new Random().nextInt(Result.values().length);
        return Result.values()[result];
    }

    public void play(Team team){
        result = randomResult();
        //if result is win points increase by 3
        if (result == Result.WIN){
            addPoints(Result.WIN);
        }else if(result == Result.DRAW){
            team.addPoints(Result.DRAW);
            addPoints(Result.DRAW);
        }else{
            team.addPoints(Result.WIN);
        }


    }

    //add points method

    public void addPoints(Result result){
        points += result.getValue();
    }
}
