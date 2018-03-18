import db.DBHelper;
import models.*;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        League league = new League("La Liga", new GregorianCalendar(2018, 3, 15), new GregorianCalendar(2018, 7, 15));
        Manager manager1 = new Manager("Pep Guardiola");
        Manager manager2 = new Manager("Zinedine Zidane");
        Team team1 = new Team("Barcelona", manager1, 24);
        Team team2 = new Team("Real Madrid", manager2, 24);
        Player player1 = new Player("Lionel Messi");
        Player player2 = new Player("Luis Suarez");
        Player player3 = new Player("Andreas Iniesta");
        Player player4 = new Player("Sergio Busquets");
        Player player5 = new Player("Cristiano Ronaldo");
        Player player6 = new Player("Gareth Bale");
        Player player7 = new Player("Karim Benzema");
        Player player8 = new Player("Sergio Ramos");
        Cup cup = new Cup("Copa Del Rey", new GregorianCalendar(2018, 3, 15), new GregorianCalendar(2018, 7, 15));

        DBHelper.saveOrUpdate(league);
        DBHelper.saveOrUpdate(manager1);
        DBHelper.saveOrUpdate(manager2);
        DBHelper.saveOrUpdate(player1);
        DBHelper.saveOrUpdate(player2);
        DBHelper.saveOrUpdate(player3);
        DBHelper.saveOrUpdate(player4);
        DBHelper.saveOrUpdate(player5);
        DBHelper.saveOrUpdate(player6);
        DBHelper.saveOrUpdate(player7);
        DBHelper.saveOrUpdate(player8);
        DBHelper.saveOrUpdate(cup);

        Team foundTeam = DBHelper.find(Team.class, team1.getId());

        DBHelper.delete(player8);
        List<Player> foundPlayers = DBHelper.getAll(Player.class);

    }
}
