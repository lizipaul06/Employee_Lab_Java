package Staff.Management;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Iain", "JS234345", 5000.02, "Tech");
    }

    @Test
    public void canGetName(){
        assertEquals("Iain", manager.getName());
    }

    @Test
    public void canSetName(){
        manager.setName("Tom");
        assertEquals("Tom",manager.getName() );
    }
    @Test
    public void getNiNumber(){
        assertEquals("JS234345", manager.getNiNumber());
    }

    @Test
    public void canSetNI(){
        manager.setNiNumber("NM203058");
        assertEquals("NM203058", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(5000.02, manager.getSalary());
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(6000.74);
        assertEquals(6000.74, manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(600);
        assertEquals(5600.02, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(50.00020000000001, manager.payBonus());
    }

    @Test
    public void canGetDept(){
        assertEquals("Tech", manager.getDeptName());
    }
}
