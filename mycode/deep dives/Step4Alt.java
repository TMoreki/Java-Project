import java.util.Scanner;

public class Step4Alt {
   private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
       int[][] arr = new int[10][10];
       populateArray(arr);

       int choice;
       do {
           choice = printMenu();
           if (choice == 1) {
               int row = promptRow(arr);
               if (row != -1) {
                   int[] rowArray = getRow(arr, row);
                   if (rowArray != null) {
                       System.out.print("Row " + row + ": ");
                       printArray(rowArray);
                   }
               }
           } else if (choice == 2) {
               int column = promptColumn(arr);
               if (column != -1) {
                   int[] columnArray = getColumn(arr, column);
                   if (columnArray != null) {
                       System.out.print("Column " + column + ": ");
                       printArray(columnArray);
                   }
               }
           } else if (choice == 3) {
               int[] cellIndex = promptCell(arr);
               if (cellIndex[0] != -1 && cellIndex[1] != -1) {
                   int cell = getCell(arr, cellIndex[0], cellIndex[1]);
                   if (cell != -1) {
                       System.out.println("Cell [" + cellIndex[0] + "][" + cellIndex[1] + "]: " + cell);
                   }
               }
           } else if (choice == 4) {
               System.out.println("Exiting program...");
           } else {
               System.out.println("Invalid choice. Try again.");
           }
       } while (choice != 4);
   }

   private static void populateArray(int[][] arr) {
       int value = 1;
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] = value++;
           }
       }
   }

   private static int[] getRow(int[][] arr, int row) {
       if (row < 0 || row >= arr.length) {
           System.out.println("Error: Row index out of bounds");
           return null;
       }
       return arr[row];
   }

   private static int[] getColumn(int[][] arr, int column) {
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

   private static int getCell(int[][] arr, int row, int column) {
       if (row < 0 || row >= arr.length || column < 0 || column >= arr[0].length) {
           System.out.println("Error: Row or column index out of bounds");
           return -1;
       }
       return arr[row][column];
   }

   private static int printMenu() {
       System.out.println("\nMenu:");
       System.out.println("1. Get row");
       System.out.println("2. Get column");
       System.out.println("3. Get cell");
       System.out.println("4. Exit");
       System.out.print("Enter your choice: ");
       return scanner.nextInt();
   }

   private static int promptRow(int[][] arr) {
       int row;
       do {
           System.out.print("Enter row index (0-" + (arr.length - 1) + "): ");
           row = scanner.nextInt();
           if (row < 0 || row >= arr.length) {
               System.out.println("Invalid row index. Try again.");
           }
       } while (row < 0 || row >= arr.length);
       return row;
   }

   private static int promptColumn(int[][] arr) {
       int column;
       do {
           System.out.print("Enter column index (0-" + (arr[0].length - 1) + "): ");
           column = scanner.nextInt();
           if (column < 0 || column >= arr[0].length) {
               System.out.println("Invalid column index. Try again.");
           }
       } while (column < 0 || column >= arr[0].length);
       return column;
   }

   private static int[] promptCell(int[][] arr) {
       int row, column;
       do {
           System.out.print("Enter row index (0-" + (arr.length - 1) + "): ");
           row = scanner.nextInt();
           if (row < 0 || row >= arr.length) {
               System.out.println("Invalid row index. Try again.");
           }
       } while (row < 0 || row >= arr.length);

       do {
           System.out.print("Enter column index (0-" + (arr[0].length - 1) + "): ");
           column = scanner.nextInt();
           if (column < 0 || column >= arr[0].length) {
               System.out.println("Invalid column index. Try again.");
           }
       } while (column < 0 || column >= arr[0].length);

       return new int[]{row, column};
   }

   private static void printArray(int[] arr) {
       for (int value : arr) {
           System.out.print(value + " ");
       }
       System.out.println();
   }
}