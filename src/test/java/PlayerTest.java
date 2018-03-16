import org.junit.Before;
import org.junit.Test;

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
}
