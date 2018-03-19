import db.DBHelper;
import models.Cup;
import models.League;
import models.Manager;
import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class ManagerDBTest {

    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Arsene Wenger");
        DBHelper.saveOrUpdate(manager);
    }


    @Test
    public void testCanSave() {
        Manager found = DBHelper.find(Manager.class, manager.getId());
        assertEquals("Arsene Wenger", found.getName());
    }

    @Test
    public void testCanUpdate(){
        Manager found = DBHelper.find(Manager.class, manager.getId());
        found.setName("Brendan Rodgers");
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Manager.class, found.getId());
        assertEquals("Brendan Rodgers", found.getName());
    }
}
