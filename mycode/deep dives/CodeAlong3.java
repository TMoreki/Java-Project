public class CodeAlong3 { //Step 3
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        populateArray(arr);

        int[] row = getRow(arr, 3);
        if (row != null) {
            printArray(row);
        }

        int[] column = getColumn(arr, 5);
        if (column != null) {
            printArray(column);
        }

        int cell = getCell(arr, 5, 5); // Call getCell method with row 5 and column 5
        if (cell != -1) {
            System.out.println("Cell value: " + cell); // Print the returned cell value
        }
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

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}