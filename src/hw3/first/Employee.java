package hw3.first;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    public void compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        LocalDate date1 = LocalDate.of(year1, month1, day1);
        LocalDate date2 = LocalDate.of(year2, month2, day2);

        Period period = Period.between(date2, date1);

        int difDay = period.getDays();
        int difMonth = period.getMonths();
        int difYear = period.getYears();

        System.out.println("Разница между " + date1 + " и " + date2 + "\n" +
                difDay + " - дней " + "\n" +
                difMonth + " - месяцев " + "\n" +
                difYear + " - лет");
    }
}
