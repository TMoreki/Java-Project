public class NumberValidator{
public static boolean validator( String gradeStr){

            int grade = 0;
            try {
                grade = Integer.parseInt(gradeStr);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid grade format.");
                return true;



   }
    return false;
  }  
}