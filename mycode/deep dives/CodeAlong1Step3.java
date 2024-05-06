public class CodeAlong1Step3{
    // This is the main method, which is the entry point of the program
    public static void main(String[] args) {
        // This line calls the count() method
        count();
    }

    // This is the count() method declaration
    public static void count() {
        // Declare an integer variable i and initialize it to 1
        int i = 1;

        // This is a while loop
        while (i <= 10) { // The loop continues as long as i is less than or equal to 10
            // Print the value of i to the console
            System.out.println(i);
            // Increment the value of i by 1
            i++;
        }
    }
}
