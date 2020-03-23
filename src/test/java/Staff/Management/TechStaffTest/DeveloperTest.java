package Staff.Management.TechStaffTest;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Iain", "JS234345", 5000.02);
    }

    @Test
    public void canGetName(){
        assertEquals("Iain", developer.getName());
    }

    @Test
    public void canSetName(){
        developer.setName("Tom");
        assertEquals("Tom",developer.getName() );
    }
    @Test
    public void getNiNumber(){
        assertEquals("JS234345", developer.getNiNumber());
    }

    @Test
    public void canSetNI(){
        developer.setNiNumber("NM203058");
        assertEquals("NM203058", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(5000.02, developer.getSalary());
    }

    @Test
    public void canSetSalary(){
        developer.setSalary(6000.74);
        assertEquals(6000.74, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(600);
        assertEquals(5600.02, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(50.00020000000001, developer.payBonus());
    }
}
