public class Addition{  
  
    public static double addition(double num1, String operator, double num2) { 
double sum = num1 + num2;

System.out.println("num1 = " + num1);
System.out.println("num2 = " + num2);
sum = num1 + num2;
System.out.println("Addition = " + sum);
return sum;
    }

}


public class Subtraction{  
  
    public static double addition(double num1, String operator, double num2) { 


System.out.println("num1 = " + num1);
System.out.println("num2 = " + num2);
sub = num1 - num2;
System.out.println("Subtraction = " + sub);
return sub;
    }

}


public class Miltiplication{  
  
    public static double addition(double num1, String operator, double num2) { 


System.out.println("num1 = " + num1);
System.out.println("num2 = " + num2);
mult = num1 * num2;
System.out.println("Multiplication = " + mult);
return mult;
    }

}


public class Division {  

    public static double addition(double num1, String operator, double num2) { 


System.out.println("num1 =" + num1);
System.out.println("num2 =" + num2);
div = num1 / num2;
System.out.println("Division = " + div);
return div;
    }

}


public class Modulus{  
  
    public static double addition(double num1, String operator, double num2) { 


System.out.println("num1 = " + num1);
System.out.println("num2 = " + num2);
mod = num1 % num2;
System.out.println("Remainder = " + mod);
return mod;
    }

}


public class MenuPrinter {
    public static void Printer(double Addition,double Subtraction,double Multiplication,double Division, double Modulus) {

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mult);
        System.out.println("Division = " + div);
        System.out.println("Modulus = " + mod);



    }
}



import java.util.Scanner;

public class Prompter{ 
     public static String prompt(String input){
        Scanner in = new Scanner(System.in);
        System.out.println(input); 

       
        String number = in.nextLine();
        System.out.println();
        return number;
    }
}