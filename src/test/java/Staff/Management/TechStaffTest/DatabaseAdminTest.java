package Staff.Management.TechStaffTest;

import Staff.Employee;
import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Iain", "JS234345", 5000.02);
    }

    @Test
    public void canGetName(){
        assertEquals("Iain", databaseAdmin.getName());
    }

    @Test
    public void canSetName(){
        databaseAdmin.setName("Tom");
        assertEquals("Tom",databaseAdmin.getName() );
    }
    @Test
    public void getNiNumber(){
        assertEquals("JS234345", databaseAdmin.getNiNumber());
    }

    @Test
    public void canSetNI(){
        databaseAdmin.setNiNumber("NM203058");
        assertEquals("NM203058", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(5000.02, databaseAdmin.getSalary());
    }

    @Test
    public void canSetSalary(){
        databaseAdmin.setSalary(6000.74);
        assertEquals(6000.74, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(600);
        assertEquals(5600.02, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(50.00020000000001, databaseAdmin.payBonus());
    }
}
