import java.util.Random;

public class PsTest {
    
    // Function to populate the array with numbers
    public static void populateArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1; // Generates a random number between 1 and 100
        }
    }

    // Function to print the elements of the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Function to increment each element of the array by 1
    public static void incrementArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    // Main function
    public static void main(String[] args) {
        // Declare an array of size 50
        int[] array = new int[50];

        // Populate the array with numbers
        populateArray(array);

        // Print the elements of the array
        System.out.println("Original Array:");
        printArray(array);

        // Increment each element of the array by 1
        incrementArray(array);

        // Print the elements of the array after incrementing
        System.out.println("Array after incrementing each element by 1:");
        printArray(array);
    }
}
