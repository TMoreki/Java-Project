public class Pcode1 {
    public static void main(String[] args) {
        int[] arr = new int[50]; // Declare an array of size 50

        populateArray(arr); // Populate the array with numbers
        printArray(arr, "Initial Array"); // Print the initial array

        incrementArray(arr); // Increment each element by 1
        printArray(arr, "Array after incrementing"); // Print the modified array
    }

    // Function to populate the array with numbers
    public static void populateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // Populate the array with numbers from 1 to 50
        }
    }

    // Function to print the array elements
    public static void printArray(int[] arr, String message) {
        System.out.println(message + ":");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Function to increment each element of the array by 1
    public static void incrementArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++; // Increment each element by 1
        }
    }
}