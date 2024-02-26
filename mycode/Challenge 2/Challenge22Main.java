public class Challenge2Main {
    public static void main(String[] args) {
        double num1 = Prompter.prompt("Enter the first number: ");
        double num2 = Prompter.prompt("Enter the second number: ");

        boolean menuValid = MenuValidator.isValid();
        boolean numberValid = NumberValidator.isValid();

        if (menuValid && numberValid) {
            for (int i = 0; i < 10; i++) {
                double resultAddition = num1 + num2;
                System.out.println("Addition Result " + (i + 1) + ": " + resultAddition);
            }

            for (int i = 0; i < 10; i++) {
                double resultSubtraction = num1 - num2;
                System.out.println("Subtraction Result " + (i + 1) + ": " + resultSubtraction);
            }

            for (int i = 0; i < 10; i++) {
                double resultMultiplication = num1 * num2;
                System.out.println("Multiplication Result " + (i + 1) + ": " + resultMultiplication);
            }

            for (int i = 0; i < 10; i++) {
                double resultDivision = num1 / num2;
                System.out.println("Division Result " + (i + 1) + ": " + resultDivision);
            }

            for (int i = 0; i < 10; i++) {
                double resultModulus = num1 % num2;
                System.out.println("Modulus Result " + (i + 1) + ": " + resultModulus);
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
