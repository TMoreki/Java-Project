package advance;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String[] args) {
        Calendar dateInstance = GregorianCalendar.getInstance();

        dateInstance.set(Calendar.DAY_OF_MONTH, 1);
        dateInstance.set(Calendar.MONTH, 9); // Month is zero-based, so 9 represents October
        dateInstance.set(Calendar.YEAR, 2012);

        Date date = dateInstance.getTime();

        System.out.println("Date : " + date);
    }
}
