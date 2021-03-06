import db.DBHelper;
import models.Cup;
import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CupDBTest {

    Cup cup;
    Cup cup2;

    @Before
    public void setUp() throws Exception {
        cup = new Cup("Copa Del Rey", new GregorianCalendar(2018, 3, 15), new GregorianCalendar(2018, 7, 15));
        cup2 = new Cup("Scottish Cup", new GregorianCalendar(2018, 3, 15), new GregorianCalendar(2018, 7, 15));
        DBHelper.saveOrUpdate(cup);
        DBHelper.saveOrUpdate(cup2);
    }

    @Test
    public void testCanSave() {
        Cup found = DBHelper.find(Cup.class, cup.getId());
        assertEquals("Copa Del Rey", found.getName());
    }

    @Test
    public void testCanUpdate(){
        Cup found = DBHelper.find(Cup.class, cup.getId());
        found.setName("FA Cup");
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Cup.class, found.getId());
        assertEquals("FA Cup", found.getName());
    }


    @Test
    public void testCanDelete(){
        DBHelper.delete(cup);
        List<Object> cups = DBHelper.getAll(Cup.class);
        assertEquals(1, cups.size());
    }


}
