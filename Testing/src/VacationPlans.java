class VacationDates {
    boolean datesAreWorkingDays;

    VacationDates(boolean datesAreWorkingDays) {
        this.datesAreWorkingDays = datesAreWorkingDays;
    }
}
class Person {
    String name;
    String surname;
    int moneySaved;
    int moneyNeeded;
    boolean canUseVacationDays;

    Person(String name, String surname, int moneySaved, int moneyNeeded, boolean canUseVacationDays) {
        this.name = name;
        this.surname = surname;
        this.moneySaved = moneySaved;
        this.moneyNeeded = moneyNeeded;
        this.canUseVacationDays = canUseVacationDays;
    }
}

public class VacationPlans {

    public void canGoOnVacation(Person person, VacationDates vacationDates) {
	System.out.println("This program checks if a person can go on a vacation during a particular time.");

	boolean canGo = ((person.moneySaved > person.moneyNeeded) && (!vacationDates.datesAreWorkingDays || (person.canUseVacationDays)));

	if (canGo) {
	    System.out.println("The person " + person.name + " " + person.surname + " can go on a vacation.");
    } else {
        System.out.println("The person " + person.name + " " + person.surname + " can't go on a vacation.");
    }
    }
}
