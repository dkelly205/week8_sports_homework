import java.util.GregorianCalendar;
import java.util.Random;

public class League extends Competition {

    public League() {
    }

    public League(String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        super(name, startDate, endDate);
    }

    public void playMatch(Team team1, Team team2) {
        Result result = randomResult();
        if (result == Result.WIN){
            team1.addPoints(Result.WIN);
        }else if(result == Result.DRAW){
            team1.addPoints(Result.DRAW);
            team2.addPoints(Result.DRAW);
        }else{
            team2.addPoints(Result.WIN);
        }
    }
}

