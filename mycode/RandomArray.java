import java.util.Random;

public class RandomArray {
    
    // Function to populate the array with random numbers
    public static void populateArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // Random number between 1 and 100
        }
    }
    
    // Function to print the elements of the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Move to the next line after printing all elements
    }
    
    // Function to increment each element of the array by 1
    public static void incrementArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 1;
        }
    }

    public static void main(String[] args) {
        // Declare an array of size 50
        int[] array = new int[50];

        // Populate the array
        populateArray(array);

        // Print the original array
        System.out.println("Original array:");
        printArray(array);

        // Increment each element of the array by 1
        incrementArray(array);

        // Print the modified array
        System.out.println("Modified array:");
        printArray(array);
    }
}