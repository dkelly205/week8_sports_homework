import java.util.GregorianCalendar;

public class League extends Competition {

    public League() {
    }

    public League(String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        super(name, startDate, endDate);
    }


    public void playMatch(Team team1, Team team2) {
        //if team 1 beats team 2, team1 gains 3 points and team2 gets nothing

        //else if both teams draw then both gain 1 point

        //else team 1 loses, team2 gets 3 points and team1 gets nothing

//        if(team1.play(team2) == Result.WIN){
//
//        } else
//
//
//
     }
}
