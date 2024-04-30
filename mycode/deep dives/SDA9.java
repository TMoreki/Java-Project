public class SDA9 {
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
        int i = 0;
        while (i < 100) {
            int j = 0;
            while (j < 30) {
                arr[i][j] = i * 30 + j;
                j++;
            }
            i++;
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
        int i = 0;
        while (i < 100) {
            int j = 0;
            while (j < 30) {
                int value = arr[i][j];
                int remainder = value % 2;
                switch (remainder) {
                    case 0:
                        System.out.print(value + " ");
                        break;
                    default:
                        remainder = value % 11;
                        switch (remainder) {
                            case 0:
                                System.out.print(value + " ");
                                break;
                        }
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}


class ArrayIncrementer {
    private int[][] arr;

    public ArrayIncrementer(int[][] arr) {
        this.arr = arr;
    }

    public void incrementArray() {
        int i = 0;
        while (i < 100) {
            int j = 0;
            while (j < 30) {
                arr[i][j]++;
                j++;
            }
            i++;
        }
    }
}