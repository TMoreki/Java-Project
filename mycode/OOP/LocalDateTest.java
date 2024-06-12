import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
        Period p = Period.between(birthday, currentDate);
        
        // Subtract 5 years from the period
        Period modifiedPeriod = p.minusYears(5);
        
        System.out.println("You are " + modifiedPeriod.getYears() + " years, " + modifiedPeriod.getMonths() +
                           " months, and " + modifiedPeriod.getDays() + " days old.");
    }
}
