import java.util.GregorianCalendar;

public class League extends Competition {

    public League() {
    }

    public League(String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        super(name, startDate, endDate);
    }


    public void playMatch(Team team1, Team team2) {
        //if team 1 beats team 2, team1 gains 3 points and team2 gets nothing
        team1.play(team2);
        team2.play("loss");
        //else if both teams draw then both gain 1 point
        team1.play("draw");
        team2.play("draw");
        //else team 1 loses, team2 gets 3 points and team1 gets nothing
        team1.play("loss");
        team2.play("win");

    }
}
