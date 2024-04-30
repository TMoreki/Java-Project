public class Fibonacci {
    public static void main(String[] args) {
        int n = 20; // Number of Fibonacci numbers to print
        int num1 = 0, num2 = 1;

        System.out.println(num1); // Print the first Fibonacci number
        System.out.println(num2); // Print the second Fibonacci number

        for (int i = 2; i < n; i++) {
            int nextNum = num1 + num2;
            System.out.println(nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}