import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CupTest {

    Cup cup;
    Team team1;
    Team team2;
    Team team3;
    Team team4;

    Manager manager;

    @Before
    public void setUp() throws Exception {
        cup = new Cup("Copa Del Rey", new GregorianCalendar(2018, 3, 15), new GregorianCalendar(2018, 7, 15));
        team1 = new Team("Barcelona", manager, 24);
        team2 = new Team("Real Madrid", manager, 24);
        team3 = new Team("Real Betis", manager, 24);
        team4 = new Team("Valencia", manager, 24);

    }

    @Test
    public void testName() {
        assertEquals("Copa Del Rey", cup.getName());
    }

    @Test
    public void testStartDate() {
        assertEquals(new GregorianCalendar(2018, 3, 15), cup.getStartDate());
    }

    @Test
    public void testEndDate() {
        assertEquals(new GregorianCalendar(2018, 7, 15), cup.getEndDate());
    }

    @Test
    public void testCupStartsEmpty(){
        assertEquals(0, cup.getNumberOfTeams());
    }

    @Test
    public void testCanAddTeam(){
        cup.addTeam(team1);
        assertEquals(1, cup.getNumberOfTeams());
    }

    @Test
    public void testLoserGetsRemoved(){
        cup.addTeam(team1);
        cup.addTeam(team2);
        cup.addTeam(team3);
        cup.addTeam(team4);
        assertEquals(4, cup.getNumberOfTeams());
        cup.playMatch(team1, team2);
        cup.playMatch(team3, team4);
        assertEquals(2, cup.getNumberOfTeams());
    }


}