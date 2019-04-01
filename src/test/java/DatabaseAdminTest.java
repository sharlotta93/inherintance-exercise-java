import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

        DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Jackie", 222666, 40000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jackie", databaseAdmin.getName());
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Bonny");
        assertEquals("Bonny", databaseAdmin.getName());
    }

    @Test
    public void hasNI() {
        assertEquals(222666, databaseAdmin.getNi());
    }


    @Test
    public void hasSalary() {
        assertEquals(40000.00, databaseAdmin.getSalary(), 2);
    }

    @Test
    public void canChangeSalary() {
        databaseAdmin.setSalary(30000.00);
        assertEquals(30000.00, databaseAdmin.getSalary(), 2);
    }

    @Test
    public void canCanRaise() {
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(42000.00, databaseAdmin.getSalary(), 2);
    }

    @Test
    public void canPayBonus() {
        double bonus = databaseAdmin.payBonus();
        assertEquals(400.00, bonus, 2);
    }
}
