import java.util.Scanner; 

public class CharTest{
    public static void main(String [] args){
     

     Scanner s = new Scanner(System.in);

     int n;
     do {
     	System.out.print(" enter a number between 1 and 10: ");
     	n = s.nextInt();
        
     } while (n < 1 || n > 10);



     System.out.println(" number is between  1 and 10: ");
     
     System.out.println(" You can move on: ");
     
  
    }
	
}

