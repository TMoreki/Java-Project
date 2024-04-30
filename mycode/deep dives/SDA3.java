public class SDA3 {
    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations();
        arrayOperations.performOperations();
    }
}


class ArrayOperations {
    private int[] arr = new int[50];

    public void performOperations() {
        ArrayInitializer arrayInitializer = new ArrayInitializer(arr);
        arrayInitializer.initializeArray();

        ArrayPrinter arrayPrinter = new ArrayPrinter(arr);
        arrayPrinter.printOriginalArray();

        ArrayIncrementer arrayIncrementer = new ArrayIncrementer(arr);
        arrayIncrementer.incrementArray();

        arrayPrinter.printIncrementedArray();
    }
}


class ArrayInitializer {
    private int[] arr;

    public ArrayInitializer(int[] arr) {
        this.arr = arr;
    }

    public void initializeArray() {
        int i = 0;
        while (i < arr.length) {
            arr[i] = i * 2;
            i++;
        }
    }
}


class ArrayPrinter {
    private int[] arr;

    public ArrayPrinter(int[] arr) {
        this.arr = arr;
    }

    public void printOriginalArray() {
        System.out.println("Even numbers and numbers divisible by 11 from the original array:");
        printEvenAndDivisibleByEleven(arr);
    }

    public void printIncrementedArray() {
        System.out.println("Even numbers and numbers divisible by 11 from the incremented array:");
        printEvenAndDivisibleByEleven(arr);
    }

    private void printEvenAndDivisibleByEleven(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            switch (arr[i] % 2) {
                case 0:
                    System.out.print(arr[i] + " ");
                    break;
                default:
                    switch (arr[i] % 11) {
                        case 0:
                            System.out.print(arr[i] + " ");
                            break;
                    }
            }
            i++;
        }
        System.out.println();
    }
}


class ArrayIncrementer {
    private int[] arr;

    public ArrayIncrementer(int[] arr) {
        this.arr = arr;
    }

    public void incrementArray() {
        int i = 0;
        while (i < arr.length) {
            arr[i]++;
            i++;
        }
    }
}