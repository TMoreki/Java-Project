public class StringArray2 {
    public static void main(String[] args) {
        // Initialize a string with multiple lines, each line containing comma-separated numbers
        String line = "1,4,3,2,3,7,5,6,9\n" +
                      "8,6,3,7,3,7,5,6,9\n";

        // Convert the string into a multi-dimensional array of numbers
        String[] rows = line.split("\n"); // Split the string by newline character to get each row
        int[][] numbers = new int[rows.length][]; // Create a 2D integer array to store the numbers

        // Convert each string element to an integer and store in the 2D numbers array
        for (int i = 0; i < rows.length; i++) {
            String[] numbersStr = rows[i].split(","); // Split each row by comma to get individual numbers
            numbers[i] = new int[numbersStr.length]; // Create a new row in the 2D array
            for (int j = 0; j < numbersStr.length; j++) {
                numbers[i][j] = Integer.parseInt(numbersStr[j]); // Convert string to integer and store in the 2D array
            }
        }

        // Sort the multi-dimensional array in ascending order
        sort(numbers, true); // Call the sort method with ascending order flag set to true

        System.out.println("Sorted in ascending order:");
        // Print the sorted 2D array in ascending order
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Sort the multi-dimensional array in descending order
        sort(numbers, false); // Call the sort method with ascending order flag set to false

        System.out.println("Sorted in descending order:");
        // Print the sorted 2D array in descending order
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Method to sort the 2D array based on rows and individual elements
    private static void sort(int[][] arr, boolean ascending) {
        // Sort each row in ascending or descending order
        for (int i = 0; i < arr.length; i++) {
            sortRow(arr[i], ascending);
        }

        // Sort the rows in ascending or descending order
        sortRows(arr, ascending);
    }

    // Method to sort a single row in ascending or descending order
    private static void sortRow(int[] row, boolean ascending) {
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = 0; j < row.length - i - 1; j++) {
                if (ascending) {
                    if (row[j] > row[j + 1]) {
                        swap(row, j, j + 1);
                    }
                } else {
                    if (row[j] < row[j + 1]) {
                        swap(row, j, j + 1);
                    }
                }
            }
        }
    }

    // Method to sort the rows in ascending or descending order
    private static void sortRows(int[][] arr, boolean ascending) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (ascending) {
                    if (compareRows(arr[j], arr[j + 1]) > 0) {
                        swapRows(arr, j, j + 1);
                    }
                } else {
                    if (compareRows(arr[j], arr[j + 1]) < 0) {
                        swapRows(arr, j, j + 1);
                    }
                }
            }
        }
    }

    // Method to compare two rows 
    private static int compareRows(int[] row1, int[] row2) {
        int minLength = Math.min(row1.length, row2.length);
        for (int i = 0; i < minLength; i++) {
            if (row1[i] != row2[i]) {
                return row1[i] - row2[i];
            }
        }
        return row1.length - row2.length;
    }

    // Method to swap two rows in the 2D array
    private static void swapRows(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to swap two elements in a row
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}