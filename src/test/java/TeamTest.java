import models.Manager;
import models.Player;
import models.Result;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TeamTest {

    Player player1;
    Player player2;
    Player player3;
    Manager manager;
    Team team;
    Team team2;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Pep Guardiola");
        team = new Team("Barcelona", manager, 2);
        team2 = new Team("Real Madrid", manager, 20);
        player1 = new Player("Xavi", team);
        player2 = new Player("Iniesta", team);
        player3 = new Player("Messi", team);

    }

    @Test
    public void testTeamName() {
        assertEquals("Barcelona", team.getName());
    }

    @Test
    public void testTeamHasManager(){
        assertEquals("Pep Guardiola", team.getManager().getName());
    }

    @Test
    public void testTeamHasNoPlayersToStart(){
        assertEquals(0, team.numberOfPlayers());
    }

    @Test
    public void testCanAddPlayerToTeam(){
        team.addPlayer(player1);
        assertEquals(1, team.numberOfPlayers());
    }

    @Test
    public void testCanRemovePlayer(){
        team.addPlayer(player1);
        team.removePlayer(player1);
        assertEquals(0, team.numberOfPlayers());
    }

    @Test
    public void testPointsStartAt0(){
        assertEquals(0, team.getPoints());
    }

    @Test
    public void testCannotAddPlayersOverSquadLimit(){
        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player3);
        assertEquals(2, team.numberOfPlayers());
    }

    @Test
    public void testAddPoints(){
        team.addPoints(Result.LOSS);
        assertEquals(0, team.getPoints());
        team.addPoints(Result.WIN);
        assertEquals(3, team.getPoints());
        team.addPoints(Result.DRAW);
        assertEquals(4, team.getPoints());
    }









}
