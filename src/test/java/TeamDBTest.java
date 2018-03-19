import db.DBHelper;
import models.Manager;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamDBTest {

    Team team;
    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Pep");
        team = new Team("Barcelona", manager, 2);
        DBHelper.saveOrUpdate(manager);
        DBHelper.saveOrUpdate(team);
    }

    @Test
    public void testCanSave() {
        Team found = DBHelper.find(Team.class, team.getId());
        assertEquals("Barcelona", found.getName());
    }

    @Test
    public void testCanUpdate(){
        Team found = DBHelper.find(Team.class, team.getId());
        found.setName("Real Madrid");
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Team.class, team.getId());
        assertEquals("Real Madrid", found.getName());
    }
}
