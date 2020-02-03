import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "MX1234", 23000.00, "Admin" );
    }


    @Test
    public void canGetName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals("MX1234", manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(23000.00, manager.getSalary());
    }

    @Test
    public void canGetDept(){
        assertEquals("Admin", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(24000.00, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(230.00, manager.payBonus());
    }

    @Test
    public void noNegativeValueForRaiseSalary(){
        manager.raiseSalary(-200.00);
        assertEquals(23000.00, manager.getSalary());
        manager.raiseSalary(200.00);
        assertEquals(23200.00, manager.getSalary());
    }

    @Test
    public void canChangeName(){
        manager.changeName("Sandra");
        assertEquals("Sandra", manager.getName());
    }

    @Test
    public void canChangeNameNull(){
        manager.changeName(null);
        assertEquals("Bob", manager.getName());
    }

}
