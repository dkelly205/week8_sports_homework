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

    @Before
    public void setUp() throws Exception {
        player1 = new Player("Xavi");
        player2 = new Player("Iniesta");
        player3 = new Player("Messi");
        manager = new Manager("Pep Guardiola");
        team = new Team("Barcelona", manager);
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
        assertEquals(0, team.getNumberOfPlayers());
    }

    @Test
    public void testCanAddPlayerToTeam(){
        team.addPlayer(player1);
        assertEquals(1, team.getNumberOfPlayers());
    }

    @Test
    public void testCanRemovePlayer(){
        team.addPlayer(player1);
        team.removePlayer(player1);
        assertEquals(0, team.getNumberOfPlayers());
    }

    @Test
    public void testPointsStartAt0(){
        assertEquals(0, team.getPoints());
    }

    @Test
    public void testPointsChangeForWin(){
        team.play("win");
        assertEquals(3, team.getPoints());
    }

    @Test
    public void testPointsChangeForDraw(){
        team.play("draw");
        assertEquals(1, team.getPoints());
    }

    @Test
    public void testPointsStaySameForLoss(){
        team.play("loss");
        assertEquals(0, team.getPoints());
    }






}
