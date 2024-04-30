public class SDA11 {
    public static void main(String[] args) {
        TwoDimensionalArrayOperations operations = new TwoDimensionalArrayOperations();
        operations.performOperations();
    }
}


class TwoDimensionalArrayOperations {
    private int[][] array = new int[100][30];

    public void performOperations() {
        ArrayInitializer initializer = new ArrayInitializer(array);
        initializer.initializeArray();

        ArrayPrinter printer = new ArrayPrinter(array);
        printer.printOddAndDivisibleByEight();
    }
}


class ArrayInitializer {
    private int[][] array;

    public ArrayInitializer(int[][] array) {
        this.array = array;
    }

    public void initializeArray() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                array[i][j] = i * 30 + j;
            }
        }
    }
}


class ArrayPrinter {
    private int[][] array;

    public ArrayPrinter(int[][] array) {
        this.array = array;
    }

    public void printOddAndDivisibleByEight() {
        System.out.println("Odd-numbered Values and Numbers Divisible by 8:");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                int number = array[i][j];
                if (number % 2 != 0 || number % 8 == 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
    }
}