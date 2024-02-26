public class ChallengeMain{
    public static void main(String[] args) {
        boolean menuValid = true;

        while(menuValid){
            Menu.menu();
            
           String option = Prompter.prompt("Operation:");
           

            if(option.equalsIgnoreCase("x"))
            {
                System.out.println("X Exits the program");

                break;
            } 
            else
            {
                if(option.equals("+")||option.equals("-")||option.equals("*")||option.equals("/")||option.equals("%"))
                {
                   // System.out.println("operator hits here");
                } 
                else
                {
                    System.out.println("Unknown sign");

                    continue;   
                }
            }

                   // System.out.println("programme continues...");


                double operand1 = 0;
                String op1 = Prompter.prompt("Operand 1:");
                boolean checkNumber1 = NumberValidator.validateOperand(op1);
                if(checkNumber1){
                    operand1 = Double.parseDouble(op1);
                }
                else{
                    if(op1.equalsIgnoreCase("x")){
                    System.out.println("op1 x exits");

                        break;
                    }
                    else{
                        System.out.println("invalid operand 1");
                        continue;

                    }
                }

                double operand2 = 0;
                String op2 = Prompter.prompt("Operand 2:");
                boolean checkNumber2 = NumberValidator.validateOperand(op2);
                if(checkNumber2){
                    operand2 = Double.parseDouble(op2);
                }
                else{
                    if(op2.equalsIgnoreCase("x")){
                    System.out.println("op2 x - works");

                        break;
                    }
                    else{
                        System.out.println("invalid operand 2");
                        continue;

                    }
                }



                double result = 0;
                if (option.equals("+")) {
                    result = Addition.add(operand1, operand2);
                } else if (option.equals("-")) {
                    result = Subtraction.subtract(operand1, operand2);
                } else if (option.equals("*")) {
                    result = Multiplication.multiply(operand1, operand2);
                } else if (option.equals("/")) {
                    result = Division.divide(operand1, operand2);
                } else if (option.equals("%")) {
                    result = Modulus.modulus(operand1, operand2);
                } 
                // else {
                //     System.out.println("Unknown sign");
                //     continue; 
                // }
                
                System.out.println(operand1 + " " + option + " " + operand2 + " = " + result);

              
        } 
     
    }
}
