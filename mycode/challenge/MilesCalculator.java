public class MilesCalculator {
    public static double calculate(String distance) {
 
    
//1km= 0.621371 miles

		
    double miles  = Integer.parseInt(distance) * 0.621371;
        return miles;
        

    }
}

