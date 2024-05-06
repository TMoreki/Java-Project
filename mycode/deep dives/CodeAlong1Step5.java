public class CodeAlong1Step5 {
    // This is the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Declare and initialize a 2D array of integers called numbers with 10 rows and 10 columns
        int[][] numbers = new int[10][10]; 

        // Declare and initialize an integer variable called value with a value of 1
        int value = 1;

        // This is a nested for loop
        // The outer loop iterates over the rows of the 2D array
        for (int i = 0; i < numbers.length; i++) {
            // The inner loop iterates over the columns of the current row
            for (int j = 0; j < numbers[i].length; j++) {
                // Assign the current value of value to the current element of the 2D array
                numbers[i][j] = value++;//populate the 2D array with values
                // Increment the value of value by 1
            }
        }

        // Call the count() method and pass the numbers 2D array as an argument
        count(numbers); 
    }

    // This is the count() method declaration
    // It takes a 2D array of integers called max as a parameter
    public static void count(int[][] max) {
        // This is a nested enhanced for loop (also known as a for-each loop)
        // The outer loop iterates over the rows of the 2D array
        for (int[] row : max) {//going into the outer array
            // The inner loop iterates over the elements of the current row
            for (int number : row) {//going into the inner array
                // Print the current value of number to the console, followed by a space
                System.out.print(number + " ");//printing the contents of the 2D array
            }
            // Move to the next line after printing all elements of the current row
            System.out.println(); 
        }
    }
}
