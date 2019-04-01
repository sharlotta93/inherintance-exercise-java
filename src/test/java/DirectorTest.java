import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Buddy", 288883, 60000.00, "Cosco", 500000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Buddy", director.getName());
    }

    @Test
    public void canChangeName() {
        director.setName("Jack");
        assertEquals("Jack", director.getName());
    }

    @Test
    public void hasNI() {
        assertEquals(288883, director.getNi());
    }


    @Test
    public void hasSalary() {
        assertEquals(60000.00, director.getSalary(), 2);
    }

    @Test
    public void canChangeSalary() {
        director.setSalary(50000.00);
        assertEquals(50000.00, director.getSalary(), 2);
    }

    @Test
    public void canCanRaise() {
        director.raiseSalary(2000.00);
        assertEquals(62000.00, director.getSalary(), 2);
    }

    @Test
    public void canPayBonus() {
        double bonus = director.payBonus();
        assertEquals(1200.00, bonus, 2);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Cosco", director.getDeptName());
    }

    @Test
    public void canChangeDepartmentName() {
        director.setDeptName("Tesco");
        assertEquals("Tesco", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(500000.00, director.getBudget(), 2);
    }

    @Test
    public void canChangeBudget() {
        director.setBudget(600000.00);
        assertEquals(600000.00, director.getBudget(), 2);
    }
}


