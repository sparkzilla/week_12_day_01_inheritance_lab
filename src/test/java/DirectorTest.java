import management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

        Director director;

        @Before
        public void before(){
            director = new Director("Alan", "SR5678", 35000.00, "Executive", 30000.00);
        }


    @Test
    public void canGetName(){
        assertEquals("Alan", director.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals("SR5678", director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(35000.00, director.getSalary());
    }

    @Test
    public void canGetDept(){
        assertEquals("Executive", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2000.00);
        assertEquals(37000.00, director.getSalary());
    }

    @Test
    public void canPayBonusOverride(){
        assertEquals(700.00, director.payBonus());
    }
}
