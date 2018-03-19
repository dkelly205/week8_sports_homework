import models.Manager;
import models.Player;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Team team;
    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Pep");
        team = new Team("Barcelona", manager, 24);
        player = new Player("Lionel Messi", team);
    }

    @Test
    public void testName() {
        assertEquals("Lionel Messi", player.getName());
    }

    @Test
    public void testSetName(){
        player.setName("Iniesta");
        assertEquals("Iniesta", player.getName());
    }






}
