public class NumberValidator {

   public static boolean isValid(String input) { 
   
  try {  
    Double.parseDouble(input);
    return true;  

  } catch( NumberFormatException ex){  
    return false;
  }
}
    
}

	 	 
