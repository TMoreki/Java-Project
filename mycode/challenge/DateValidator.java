import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateValidator{

   public static boolean isValid(String strDate)
   {
	boolean valid =false;
	if (strDate.trim().equals(""))
	{
	    return false;
	}
	
	else
	{
	    
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/mm/yyyy");
	    sdfrmt.setLenient(false);
	    
	    try
	    {
	        sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
                valid = true;
	    }
	    
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        valid =false;
	    }
	   
	    return valid;
	}
   }
   
}