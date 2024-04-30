public class StringArray2{
    public static void main(String[] args) {
        String line = "1,4,3,2,3,7,5,6,9\n" +
                      "8,6,3,7,3,7,5,6,9\n";

        // Convert the string into a multi-dimensional array of numbers
        String[] rows = line.split("\n");
        int[][] numbers = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] numbersStr = rows[i].split(",");
            numbers[i] = new int[numbersStr.length];
            for (int j = 0; j < numbersStr.length; j++) {
                numbers[i][j] = Integer.parseInt(numbersStr[j]);
            }
        }

        // Sort the multi-dimensional array in ascending order
        sort(numbers, true);
        System.out.println("Sorted in ascending order:");
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Sort the multi-dimensional array in descending order
        sort(numbers, false);
        System.out.println("Sorted in descending order:");
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void sort(int[][] arr, boolean ascending) {
        for (int i = 0; i < arr.length; i++) {
            sortRow(arr[i], ascending);
        }
        sortRows(arr, ascending);
    }

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

    private static int compareRows(int[] row1, int[] row2) {
        int minLength = Math.min(row1.length, row2.length);
        for (int i = 0; i < minLength; i++) {
            if (row1[i] != row2[i]) {
                return row1[i] - row2[i];
            }
        }
        return row1.length - row2.length;
    }

    private static void swapRows(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}