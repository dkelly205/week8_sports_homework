package models;

import java.util.GregorianCalendar;

public class Cup extends Competition {

    private Result result;

    public Cup(String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        super(name, startDate, endDate);

    }

    public void playMatch(models.Team team1, models.Team team2) {
        result = randomResult();

        if (result == Result.WIN){
            getTeams().remove(team2);
        }else
            getTeams().remove(team1);
    }

}
