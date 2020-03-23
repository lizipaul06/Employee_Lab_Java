package Staff;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmployeeTest {

     Employee employee;

    @Before
    public void before(){
    employee = new Employee("Iain", "JS234345", 5000.02);
    }

    @Test
    public void canGetName(){
        assertEquals("Iain", employee.getName());
    }

    @Test
    public void canSetName(){
        employee.setName("Tom");
        assertEquals("Tom",employee.getName() );
    }

    @Test
    public void wontSetNameToNull(){
        employee.setName(null);
        assertEquals("Iain", employee.getName());
    }
    @Test
    public void getNiNumber(){
        assertEquals("JS234345", employee.getNiNumber());
    }

    @Test
    public void canSetNI(){
        employee.setNiNumber("NM203058");
        assertEquals("NM203058", employee.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(5000.02, employee.getSalary());
    }

    @Test
    public void canSetSalary(){
        employee.setSalary(6000.74);
        assertEquals(6000.74, employee.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(600);
        assertEquals(5600.02, employee.getSalary());
    }

    @Test
    public void canNotDecreaseSalary(){
        employee.raiseSalary(-500);
        assertEquals(5000.02, employee.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(50.00020000000001, employee.payBonus());
    }
}






