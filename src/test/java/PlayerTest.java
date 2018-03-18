import models.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player("Lionel Messi");


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
