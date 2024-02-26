public class ChallengeMain {
    
    public static void main(String[] args) {
        boolean menuValid = true;

        while (menuValid) {
            Menu.menu();
            
            String option = Prompter.prompt("Operation:");
            if (!MenuValidator.validate(option)) break;

            if(option.equalsIgnoreCase("x"))
            {
                break;
            } 
            else
            {
                if(option.equals("+")||option.equals("-")||option.equals("*")||option.equals("/")||option.equals("%"))
                {
                    System.out.println("operator hits here");
                } 
                else
                {
                    continue;   
                }
            }
              
                // String op1 = Prompter.prompt("First number:"); 
                // if (!MenuValidator.validate(op1)) break;
                // double doubleOp1 = NumberValidator.validateOperand(op1);
                // String op2 = Prompter.prompt("Second number:");
                // if (!MenuValidator.validate(op2)) break;
                // double doubleOp2 = NumberValidator.validateOperand(op2);

                
                // double result = 0;
                // if (option.equals("+")) {
                //     result = Addition.add(doubleOp1, doubleOp2);
                // } else if (option.equals("-")) {
                //     result = Subtraction.subtract(doubleOp1, doubleOp2);
                // } else if (option.equals("*")) {
                //     result = Multiplication.multiply(doubleOp1, doubleOp1);
                // } else if (option.equals("/")) {
                //     result = Division.divide(doubleOp1, doubleOp2);
                // } else if (option.equals("%")) {
                //     result = Modulus.modulus(doubleOp2, doubleOp2);
                // } else {
                //     System.out.println("Unknown sign");
                //     continue; 
                // }
                
                // System.out.println(doubleOp1 + " " + option + " " + doubleOp2 + " = " + result);
            } 
        //     else {
        //         System.out.println("Invalid Menu");
            
        // }
    }
}
