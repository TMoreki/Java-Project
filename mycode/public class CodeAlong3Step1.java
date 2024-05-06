public class CodeAlong3 {
    // This is the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Declare and initialize a 2D array of integers called arr with 10 rows and 10 columns
        int[][] arr = new int[10][10];

        // Call the populateArray method and pass the arr 2D array as an argument
        populateArray(arr);

        // Call the getRow method and pass the arr 2D array and the row index 3 as arguments
        // Store the returned array in the row variable
        int[] row = getRow(arr, 3);

        // Check if the row variable is not null
        if (row != null) {
            // If it's not null, call the printArray method and pass the row array as an argument
            printArray(row);
        }
    }

    // This method populates the given 2D array with sequential values
    private static void populateArray(int[][] arr) {
        // Declare and initialize a value variable with 1
        int value = 1;

        // Nested loop to iterate over the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Assign the current value to the current element of the 2D array
                arr[i][j] = value++;
                // Increment the value variable
            }
        }
    }

    // This method returns a row from the given 2D array
    private static int[] getRow(int[][] arr, int row) {
        // Check if the row index is out of bounds
        if (row < 0 || row >= arr.length) {
            // If it's out of bounds, print an error message and return null
            System.out.println("Error: Row index out of bounds");
            return null;
        }

        // If the row index is valid, return the corresponding row from the 2D array
        return arr[row];
    }

    // This method prints the elements of the given array
    private static void printArray(int[] arr) {
        // Enhanced for loop to iterate over the array
        for (int value : arr) {
            // Print each value followed by a space
            System.out.print(value + " ");
        }
        // Move to the next line after printing all values
        System.out.println();
    }
}

