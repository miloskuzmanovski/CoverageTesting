import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VacationPlansTest {
    @Test
    public void test01() {
        //Happy path, the program is working.
        Person person = new Person("Tom", "Johnson", 2500, 2000, true);
        VacationDates vacationDates = new VacationDates(true);
        boolean canGo = ((person.moneySaved > person.moneyNeeded) && (!vacationDates.datesAreWorkingDays || (person.canUseVacationDays)));
        assertTrue(canGo);
    }
    @Test
    public void test02() {
        //The program is failing because the person doesn't have enough money.
        Person person = new Person("Nico", "Wilson", 1450, 2000, true);
        VacationDates vacationDates = new VacationDates(true);
        boolean canGo = ((person.moneySaved > person.moneyNeeded) && (!vacationDates.datesAreWorkingDays || (person.canUseVacationDays)));
        assertFalse(canGo);
    }
    @Test
    public void test03() {
        //The program is failing because the person doesn't have vacation days to use.
        Person person = new Person("Milosh", "Kuzmanovski", 2100, 2000, false);
        VacationDates vacationDates = new VacationDates(true);
        boolean canGo = ((person.moneySaved > person.moneyNeeded) && (!vacationDates.datesAreWorkingDays || (person.canUseVacationDays)));
        assertFalse(canGo);
    }
}
