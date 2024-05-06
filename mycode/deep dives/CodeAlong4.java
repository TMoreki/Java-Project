public class CodeAlong4 {
   public static void main(String[] args) {
       // Create a 2D array with 10 rows and 10 columns
       int[][] arr = new int[10][10];
       // Populate the array with consecutive integers starting from 1
       populateArray(arr);

       int option;
       do {
           // Print the menu and get the user's choice
           option = printMenu();
           switch (option) {
               case 1:
                   // Prompt the user for a row index and print that row
                   int row = promptRow(arr);1

                   if (row != -1) {
                       printArray(getRow(arr, row));
                   }
                   break;
               case 2:
                   // Prompt the user for a column index and print that column
                   int column = promptColumn(arr);
                   if (column != -1) {
                       printArray(getColumn(arr, column));
                   }
                   break;
               case 3:
                   // Prompt the user for a row and column index and print the value at that cell
                   int[] cellIndices = promptCell(arr);
                   if (cellIndices != null) {
                       int cellValue = getCell(arr, cellIndices[0], cellIndices[1]);
                       if (cellValue != -1) {
                           System.out.println("Cell value: " + cellValue);
                       }
                   }
                   break;
               case 4:
                   System.out.println("Exiting...");
                   break;
               default:
                   System.out.println("Invalid option, please try again.");
           }
       } while (option != 4);
   }

   // Populate the 2D array with consecutive integers starting from 1
   public static void populateArray(int[][] arr) {
       int value = 1;
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] = value++;
           }
       }
   }

   // Get the row at the specified index from the 2D array
   public static int[] getRow(int[][] arr, int row) {
       if (row < 0 || row >= arr.length) {
           System.out.println("Error: Row index out of bounds");
           return null;
       }
       return arr[row];
   }

   // Get the column at the specified index from the 2D array
   public static int[] getColumn(int[][] arr, int column) {
       if (column < 0 || column >= arr[0].length) {
           System.out.println("Error: Column index out of bounds");
           return null;
       }
       int[] col = new int[arr.length];
       for (int i = 0; i < arr.length; i++) {
           col[i] = arr[i][column];
       }
       return col;
   }

   // Get the value at the specified row and column indices from the 2D array
   public static int getCell(int[][] arr, int row, int column) {
       if (row < 0 || row >= arr.length || column < 0 || column >= arr[0].length) {
           System.out.println("Error: Row or column index out of bounds");
           return -1;
       }
       return arr[row][column];
   }

   // Print the elements of a 1D array
   public static void printArray(int[] arr) {
       for (int value : arr) {
           System.out.print(value + " ");
       }
       System.out.println();
   }

   // Print the menu and get the user's choice
   public static int printMenu() {
       System.out.println("Menu:");
       System.out.println("1. Get Row");
       System.out.println("2. Get Column");
       System.out.println("3. Get Cell");
       System.out.println("4. Exit");
       System.out.print("Enter your choice: ");
       return new java.util.Scanner(System.in).nextInt();
   }

   // Prompt the user for a row index and validate it
   public static int promptRow(int[][] arr) {
       System.out.print("Enter row index: ");
       int row = new java.util.Scanner(System.in).nextInt();
       while (row < 0 || row >= arr.length) {
           System.out.println("Invalid row index, please try again.");
           System.out.print("Enter row index: ");
           row = new java.util.Scanner(System.in).nextInt();
       }
       return row;
   }

   // Prompt the user for a column index and validate it
   public static int promptColumn(int[][] arr) {
       System.out.print("Enter column index: ");
       int column = new java.util.Scanner(System.in).nextInt();
       while (column < 0 || column >= arr[0].length) {
           System.out.println("Invalid column index, please try again.");
           System.out.print("Enter column index: ");
           column = new java.util.Scanner(System.in).nextInt();
       }
       return column;
   }

   // Prompt the user for a row and column index and validate them
   public static int[] promptCell(int[][] arr) {
       int[] cellIndices = new int[2];
       System.out.print("Enter row index: ");
       cellIndices[0] = new java.util.Scanner(System.in).nextInt();
       while (cellIndices[0] < 0 || cellIndices[0] >= arr.length) {
           System.out.println("Invalid row index, please try again.");
           System.out.print("Enter row index: ");
           cellIndices[0] = new java.util.Scanner(System.in).nextInt();
       }
       System.out.print("Enter column index: ");
       cellIndices[1] = new java.util.Scanner(System.in).nextInt();
       while (cellIndices[1] < 0 || cellIndices[1] >= arr[0].length) {
           System.out.println("Invalid column index, please try again.");
           System.out.print("Enter column index: ");
           cellIndices[1] = new java.util.Scanner(System.in).nextInt();
       }
       return cellIndices;
   }
}


// PSEUDOCODE

// START PROGRAM

// DEFINE CLASS CodeAlong4
//     DEFINE MAIN METHOD
//         DECLARE a 2D array arr of size 10x10
//         CALL populateArray(arr)

//         DECLARE option

//         LOOP WHILE option is not 4
//             option = CALL printMenu()
//             SWITCH option
//                 CASE 1:
//                     row = CALL promptRow(arr)
//                     IF row is not -1
//                         rowArray = CALL getRow(arr, row)
//                         CALL printArray(rowArray)
//                     END IF
//                     EXIT CASE
//                 CASE 2:
//                     column = CALL promptColumn(arr)
//                     IF column is not -1
//                         columnArray = CALL getColumn(arr, column)
//                         CALL printArray(columnArray)
//                     END IF
//                     EXIT CASE
//                 CASE 3:
//                     cellIndices = CALL promptCell(arr)
//                     IF cellIndices is not null
//                         cellValue = CALL getCell(arr, cellIndices[0], cellIndices[1])
//                         IF cellValue is not -1
//                             PRINT "Cell value: " + cellValue
//                         END IF
//                     END IF
//                     EXIT CASE
//                 CASE 4:
//                     PRINT "Exiting..."
//                     EXIT LOOP
//                 DEFAULT:
//                     PRINT "Invalid option, please try again."
//             END SWITCH
//         END LOOP
//     END MAIN METHOD



//     DEFINE populateArray METHOD
//         DECLARE value = 1
//         FOR each row in arr
//             FOR each column in row
//                 arr[row][column] = value
//                 value = value + 1
//             END FOR
//         END FOR
//     END populateArray METHOD

//     DEFINE getRow METHOD
//         IF row is out of bounds
//             PRINT "Error: Row index out of bounds"
//             RETURN null
//         ELSE
//             RETURN arr[row]
//         END IF
//     END getRow METHOD

//     DEFINE getColumn METHOD
//         IF column is out of bounds
//             PRINT "Error: Column index out of bounds"
//             RETURN null
//         ELSE
//             DECLARE columnArray of size arr.length
//             FOR each row in arr
//                 columnArray[row] = arr[row][column]
//             END FOR
//             RETURN columnArray
//         END IF
//     END getColumn METHOD

//     DEFINE getCell METHOD
//         IF row or column is out of bounds
//             PRINT "Error: Row or column index out of bounds"
//             RETURN -1
//         ELSE
//             RETURN arr[row][column]
//         END IF
//     END getCell METHOD

//     DEFINE printArray METHOD
//         FOR each value in arr
//             PRINT value + " "
//         END FOR
//         PRINT a new line
//     END printArray METHOD

//     DEFINE printMenu METHOD
//         PRINT menu options
//         PROMPT user for choice
//         RETURN user choice
//     END printMenu METHOD

//     DEFINE promptRow METHOD
//         PROMPT user for row index
//         WHILE row index is out of bounds
//             PRINT error message
//             PROMPT user for row index
//         END WHILE
//         RETURN row index
//     END promptRow METHOD

//     DEFINE promptColumn METHOD
//         PROMPT user for column index
//         WHILE column index is out of bounds
//             PRINT error message
//             PROMPT user for column index
//         END WHILE
//         RETURN column index
//     END promptColumn METHOD

//     DEFINE promptCell METHOD
//         DECLARE cellIndices array of size 2
//         PROMPT user for row index
//         WHILE row index is out of bounds
//             PRINT error message
//             PROMPT user for row index
//         END WHILE
//         cellIndices[0] = row index
//         PROMPT user for column index
//         WHILE column index is out of bounds
//             PRINT error message
//             PROMPT user for column index
//         END WHILE
//         cellIndices[1] = column index
//         RETURN cellIndices
//     END promptCell METHOD

// END CLASS CodeAlong4

// END PROGRAM