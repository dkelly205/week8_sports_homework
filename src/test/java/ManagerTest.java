import models.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Pep Guardiola");
    }

    @Test
    public void testName(){
        assertEquals("Pep Guardiola", manager.getName());
    }

    @Test
    public void testSetName(){
        manager.setName("Jose Mourinho");
        assertEquals("Jose Mourinho", manager.getName());
    }
}
