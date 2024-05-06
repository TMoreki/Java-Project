public class CodeAlong3Step2 { 
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

        // Call the getColumn method and pass the arr 2D array and the column index 5 as arguments
        // Store the returned array in the column variable
        int[] column = getColumn(arr, 5);

        // Check if the column variable is not null
        if (column != null) {
            // If it's not null, call the printArray method and pass the column array as an argument
            printArray(column);
        }

        // Call the getCell method and pass the arr 2D array, row index 5, and column index 5 as arguments
        // Store the returned value in the cell variable
        int cell = getCell(arr, 5, 5);

        // Check if the cell variable is not equal to -1 (which indicates an error)
        if (cell != -1) {
            // If it's not -1, print the cell value
            System.out.println("Cell value: " + cell);
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

    // This method returns a column from the given 2D array
    private static int[] getColumn(int[][] arr, int column) {
        // Check if the column index is out of bounds
        if (column < 0 || column >= arr[0].length) {
            // If it's out of bounds, print an error message and return null
            System.out.println("Error: Column index out of bounds");
            return null;
        }

        // Declare and initialize a new array called col with the same length as the number of rows in the 2D array
        int[] col = new int[arr.length];

        // Loop through the rows of the 2D array
        for (int i = 0; i < arr.length; i++) {
            // Assign the value from the current row and the specified column index to the corresponding element in the col array
            col[i] = arr[i][column];
        }

        // Return the col array
        return col;
    }

    // This method returns the value of a specific cell in the given 2D array
    private static int getCell(int[][] arr, int row, int column) {
        // Check if the row or column index is out of bounds
        if (row < 0 || row >= arr.length || column < 0 || column >= arr[0].length) {
            // If either index is out of bounds, print an error message and return -1
            System.out.println("Error: Row or column index out of bounds");
            return -1;
        }

        // If the row and column indices are valid, return the value at the specified cell in the 2D array
        return arr[row][column];
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
