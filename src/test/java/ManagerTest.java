import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", 245883, 20000.00, "Cosco");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canChangeName() {
        manager.setName("Jack");
        assertEquals("Jack", manager.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        manager.setName(" ");
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNI() {
        assertEquals(245883, manager.getNi());
    }


    @Test
    public void hasSalary() {
        assertEquals(20000.00, manager.getSalary(), 2);
    }

    @Test
    public void canChangeSalary() {
        manager.setSalary(19000.00);
        assertEquals(19000.00, manager.getSalary(), 2);
    }

    @Test
    public void canCanRaise() {
        manager.raiseSalary(2000.00);
        assertEquals(22000.00, manager.getSalary(), 2);
    }

    @Test
    public void canPayBonus() {
        double bonus = manager.payBonus();
        assertEquals(200.00, bonus, 2);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Cosco", manager.getDeptName());
    }

    @Test
    public void canChangeDepartmentName() {
        manager.setDeptName("Tesco");
        assertEquals("Tesco", manager.getDeptName());
    }

    @Test
    public void cannotRaiseNegativeNumber() {
        manager.raiseSalary(-2000.00);
        assertEquals(20000.00, manager.getSalary(), 2);
    }



}
