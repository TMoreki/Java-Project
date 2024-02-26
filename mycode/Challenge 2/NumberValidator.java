public class NumberValidator {

   public static boolean validateOperand(String input) { 
   boolean validOp = false;
   double validNumber = 0;

  try {  
    validNumber = Double.parseDouble(input);
    validOp = true;
      

  } catch( NumberFormatException ex){
    validOp = false;  
    System.out.println("Number invalid");

  }
  return validOp;
}
    
}

         
