import java.util.Scanner;

public class Challenge222Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            Menu.Menu();
            
            String option = Prompt.prompt("Operation:", scanner);
            boolean menuValid = validate(option);
            
            if (menuValid) {
                double op1 = validateOperand("First number:", scanner);
                double op2 = validateOperand("Second number:", scanner);
                
                double result = 0;
                if (option.equals("+")) {
                    result = Addition.add(op1, op2);
                } else if (option.equals("-")) {
                    result = Subtraction.subtract(op1, op2);
                } else if (option.equals("*")) {
                    result = Multiplication.multiply(op1, op2);
                } else if (option.equals("/")) {
                    result = Division.divide(op1, op2);
                } else if (option.equals("%")) {
                    result = Modulus.modulus(op1, op2);
                } else {
                    System.out.println("Unknown sign");
                    continue; // Restart the loop
                }
                
                System.out.println(op1 + " " + option + " " + op2 + " = " + result);
            } else {
                System.out.println("Invalid Menu");
            
        }
    }
}
}