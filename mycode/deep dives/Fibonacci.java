class Fibonacci { //recursive method
    public static void main(String[] args) {
        int n = 10; 
        printFibonacciSeries(n);
    }

    static void printFibonacciSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    static int fibonacci(int n) {
        
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


// Alternative 

class Fibonacci { // iterative method 
    public static void main(String[] args) {
        int n = 11; // Number of Fibonacci numbers to print
        printFibonacciSeries(n);
    }

    static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.println(a); // Print the first Fibonacci number (0)

        for (int i = 1; i < n; i++) {
            System.out.println(b); // Print the next Fibonacci number
            int temp = b;
            b = a + b;
            a = temp;
        }
    }
}