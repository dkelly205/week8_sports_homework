package models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.util.GregorianCalendar;

@Entity
@Table(name="leagues")
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

    //tip - logic, db should be league table.  Have an order method in DB helper to order by points etc
    //could remove competition and cup classes
    //have league, manager, player, team class then game class to make it work



}

