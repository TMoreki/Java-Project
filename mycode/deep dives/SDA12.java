public class SDA12 {
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
        int i = 0;
        while (i < 100) {
            int j = 0;
            while (j < 30) {
                array[i][j] = i * 30 + j;
                j++;
            }
            i++;
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
        int i = 0;
        while (i < 100) {
            int j = 0;
            while (j < 30) {
                int number = array[i][j];
                int remainder = number % 2;
                switch (remainder) {
                    case 0:
                        remainder = number % 8;
                        switch (remainder) {
                            case 0:
                                System.out.print(number + " ");
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        System.out.print(number + " ");
                        break;
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}