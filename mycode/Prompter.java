import java.util.Scanner;

public class Prompter{ 
     public static String prompt(String input){
        Scanner in = new Scanner(System.in);
        System.out.println(input); 

       
        String name = in.nextLine();
        System.out.println();
return name;
    }
}