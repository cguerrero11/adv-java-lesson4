package chrisg.Dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Driver {
    public static void main(String[] args) {
        LocalDate TJT = LocalDate.parse("1987-04-09");
        LocalDate RAH = LocalDate.parse("1998-10-10");

        Period period = Period.between(TJT, RAH);

        System.out.println("Amount of time between 'The Joshua Tree' and 'Rattle and Rum': \n");
        System.out.print(period.getYears() + " Years, ");
        System.out.print(period.getMonths() + " Months, ");
        System.out.println(period.getDays() + " Day");
        LocalDate diff = RAH.plusDays(period.getDays()).plusMonths(period.getMonths()).plusYears(period.getYears());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM YYYY");
        System.out.println("Their new album will probably release at " + formatter.format(diff));
    }
}
