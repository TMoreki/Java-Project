public class SDA2 {
    public static void main(String[] args) {
        // ArrayUtils arrayUtils = new ArrayUtils();
        // arrayUtils.processArray();
    }

    public int[] array = new int[50];

    public void processArray() {
        initializeArray();
        printOriginalArray();
        incrementArray();
        printIncrementedArray();
    }

    public void initializeArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
    }

    public void printOriginalArray() {
        System.out.println("Original array with even numbers or divisible by 11:");
        printNumbersEvenOrDivisibleByEleven(array);
    }

    public void incrementArray() {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    public void printIncrementedArray() {
        System.out.println("Incremented array with even numbers or divisible by 11:");
        printNumbersEvenOrDivisibleByEleven(array);
    }

    public void printNumbersEvenOrDivisibleByEleven(int[] arr) {
        for (int number : arr) {
            if (number % 2 == 0 || number % 11 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}