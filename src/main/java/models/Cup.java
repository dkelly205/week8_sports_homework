package models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.util.GregorianCalendar;

@Entity
@Table(name="cups")
public class Cup extends Competition {

    private Result result;

    public Cup(String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        super(name, startDate, endDate);

    }

    public void playMatch(Team team1, Team team2) {
        result = randomResult();

        if (result == Result.WIN){
            getTeams().remove(team2);
        }else
            getTeams().remove(team1);
    }

}
