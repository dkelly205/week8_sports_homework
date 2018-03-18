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


}

