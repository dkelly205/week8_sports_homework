import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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


}
