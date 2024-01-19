public class AgeCalculator{  
  
    public static double calculate(String input) { 


String[]year = input.split("/");
double yob = 2024-Integer.parseInt(year[2]);

return yob;

    }

}