public class CodeAlong1Step4 {
    // This is the main method, which is the entry point of the program
    public static void main(String[] args) {
        // This line calls the count() method and passes the value 15 as an argument
        count(15); 
    }

    // This is the count() method declaration
    // It takes an integer parameter called max
    public static void count(int max) {
        // Declare an integer variable i and initialize it to 1
        int i = 1;

        // This is a while loop
        while (i <= max) { // The loop continues as long as i is less than or equal to max
            // Print the value of i to the console
            System.out.println(i);
            // Increment the value of i by 1
            i++;
        }
    }
}
