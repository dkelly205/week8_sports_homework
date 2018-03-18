package models;

import java.util.GregorianCalendar;

public class League extends Competition {

    public League() {
    }

    public League(String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        super(name, startDate, endDate);
    }

    public void playMatch(models.Team team1, models.Team team2) {
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

