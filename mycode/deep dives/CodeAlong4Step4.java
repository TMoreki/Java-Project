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
                   int row = promptRow(arr);
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