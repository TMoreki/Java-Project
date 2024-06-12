import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {
        Locale locale = Locale.FRENCH;

        DateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy", locale);

        Date date = new Date();

        String format = formatter.format(date);

        System.out.println("Date : " + format);
    }
}
