import db.DBHelper;
import models.Manager;
import models.Player;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerDBTest {

    Player player;
    Manager manager;
    Team team;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Pep");
        team = new Team("Barcelona", manager, 24);
        player = new Player("Lionel Messy", team);
        DBHelper.saveOrUpdate(manager);
        DBHelper.saveOrUpdate(team);
        DBHelper.saveOrUpdate(player);
    }

    @Test
    public void testCanSave(){
        Player found = DBHelper.find(Player.class, player.getId());
        assertEquals("Lionel Messy", found.getName());
    }

    @Test
    public void testCanUpdate(){
        Player found = DBHelper.find(Player.class, player.getId());
        found.setName("Lionel Messi");
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Player.class, found.getId());
        assertEquals("Lionel Messi", found.getName());

    }
}
