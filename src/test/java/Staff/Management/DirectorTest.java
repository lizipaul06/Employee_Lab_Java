package Staff.Management;

import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Iain", "JS234345", 5000.02, "Director", 500);
    }

    @Test
    public void canGetName(){
        assertEquals("Iain", director.getName());
    }

    @Test
    public void canSetName(){
        director.setName("Tom");
        assertEquals("Tom",director.getName() );
    }
    @Test
    public void getNiNumber(){
        assertEquals("JS234345", director.getNiNumber());
    }

    @Test
    public void canSetNI(){
        director.setNiNumber("NM203058");
        assertEquals("NM203058", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(5000.02, director.getSalary());
    }

    @Test
    public void canSetSalary(){
        director.setSalary(6000.74);
        assertEquals(6000.74, director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(600);
        assertEquals(5600.02, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(100.00040000000002, director.payBonus());
    }
    @Test
    public void canGetDept(){
        assertEquals("Director", director.getDeptName());
    }
    @Test
    public void canGetBudget(){
        assertEquals(500.0, director.getBudget());
    }
}
