import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jackie", 255666, 50000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jackie", developer.getName());
    }

    @Test
    public void canChangeName() {
        developer.setName("Bonny");
        assertEquals("Bonny", developer.getName());
    }

    @Test
    public void hasNI() {
        assertEquals(255666, developer.getNi());
    }


    @Test
    public void hasSalary() {
        assertEquals(50000.00, developer.getSalary(), 2);
    }

    @Test
    public void canChangeSalary() {
        developer.setSalary(40000.00);
        assertEquals(40000.00, developer.getSalary(), 2);
    }

    @Test
    public void canCanRaise() {
        developer.raiseSalary(2000.00);
        assertEquals(52000.00, developer.getSalary(), 2);
    }

    @Test
    public void canPayBonus() {
        double bonus = developer.payBonus();
        assertEquals(500.00, bonus, 2);
    }
}
