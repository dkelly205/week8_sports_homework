import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class LeagueTest {

    League league;
    Manager manager1;
    Manager manager2;
    Team team1;
    Team team2;


    @Before
    public void setUp() throws Exception {
        league = new League("La Liga", new GregorianCalendar(2018, 3, 15), new GregorianCalendar(2018, 7, 15));
        team1 = new Team("Barcelona", manager1, 24);
        team2 = new Team("Real Madrid", manager2, 24);

    }

    @Test
    public void testName() {
        assertEquals("La Liga", league.getName());
    }

    @Test
    public void testNumberOfTeams(){
        assertEquals(0, league.getNumberOfTeams());
    }
}
