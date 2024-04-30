public class SDA8 {
    public static void main(String[] args) {
        TwoDimensionalArrayOperations operations = new TwoDimensionalArrayOperations();
        operations.performOperations();
    }
}

class TwoDimensionalArrayOperations {
    private int[][] arr = new int[100][30];

    public void performOperations() {
        ArrayInitializer initializer = new ArrayInitializer(arr);
        initializer.initializeArray();

        ArrayPrinter printer = new ArrayPrinter(arr);
        printer.printOriginalArray();

        ArrayIncrementer incrementer = new ArrayIncrementer(arr);
        incrementer.incrementArray();

        printer.printIncrementedArray();
    }
}

class ArrayInitializer {
    private int[][] arr;

    public ArrayInitializer(int[][] arr) {
        this.arr = arr;
    }

    public void initializeArray() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                arr[i][j] = i * 30 + j;
            }
        }
    }
}


class ArrayPrinter {
    private int[][] arr;

    public ArrayPrinter(int[][] arr) {
        this.arr = arr;
    }

    public void printOriginalArray() {
        System.out.println("Original Array (Even numbers and numbers divisible by 11):");
        printArray(arr);
    }

    public void printIncrementedArray() {
        System.out.println("\nIncremented Array (Even numbers and numbers divisible by 11):");
        printArray(arr);
    }

    private void printArray(int[][] arr) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                int value = arr[i][j];
                if (value % 2 == 0 || value % 11 == 0) {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }
}


class ArrayIncrementer {
    private int[][] arr;

    public ArrayIncrementer(int[][] arr) {
        this.arr = arr;
    }

    public void incrementArray() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                arr[i][j]++;
            }
        }
    }
}