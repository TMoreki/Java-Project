import java.util.Scanner;

public class KeyWords{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        if (number > 100) {
            System.out.println("The number is greater than 100.");
        } else if (number < 100) {
            System.out.println("The number is less than 100.");
        } else {
            System.out.println("The number is equal to 100.");
        }

       scanner.close();
    }
}
