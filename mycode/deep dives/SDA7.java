public class SDA7 {
    public static void main(String[] args) {
        TwoDimensionalArrayOperations operations = new TwoDimensionalArrayOperations();
        operations.performOperations();
    }
}


class TwoDimensionalArrayOperations {
    private int[][] array = new int[15][5];

    public void performOperations() {
        ArrayInitializer initializer = new ArrayInitializer(array);
        initializer.initializeArray();

        ArrayPrinter printer = new ArrayPrinter(array);
        printer.printOriginalArray();

        ArrayIncrementer incrementer = new ArrayIncrementer(array);
        incrementer.incrementArray();

        printer.printIncrementedArray();
    }
}


class ArrayInitializer {
    private int[][] array;

    public ArrayInitializer(int[][] array) {
        this.array = array;
    }

    public void initializeArray() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = i * 5 + j;
            }
        }
    }
}


class ArrayPrinter {
    private int[][] array;

    public ArrayPrinter(int[][] array) {
        this.array = array;
    }

    public void printOriginalArray() {
        System.out.println("Original Array:");
        printArray(array);
    }

    public void printIncrementedArray() {
        System.out.println("\nIncremented Array:");
        printArray(array);
    }

    private void printArray(int[][] arr) {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class ArrayIncrementer {
    private int[][] array;

    public ArrayIncrementer(int[][] array) {
        this.array = array;
    }

    public void incrementArray() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j]++;
            }
        }
    }
}