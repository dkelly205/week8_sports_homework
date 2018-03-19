import db.DBHelper;
import models.Cup;
import models.League;
import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class LeagueDBTest {

    League league;

    @Before
    public void setUp() throws Exception {
        league = new League("EPL", new GregorianCalendar(2018, 3, 15), new GregorianCalendar(2018, 7, 15));
        DBHelper.saveOrUpdate(league);
    }


    @Test
    public void testCanSave() {
        League found = DBHelper.find(League.class, league.getId());
        assertEquals("EPL", found.getName());
    }

    @Test
    public void testCanUpdate(){
        League found = DBHelper.find(League.class, league.getId());
        found.setName("SPL");
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(League.class, found.getId());
        assertEquals("SPL", found.getName());
    }
}
