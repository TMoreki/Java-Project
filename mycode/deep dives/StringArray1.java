public class StringArray1 {
    public static void main(String[] args) {
        String line = "1,4,3,2,3,7,5,6,9";

        // Convert the string into an array of numbers
        String[] numbersStr = line.split(",");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        // Sort the array in ascending order
        sort(numbers, true);
        System.out.println("Sorted in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array in descending order
        sort(numbers, false);
        System.out.println("Sorted in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    private static void sort(int[] arr, boolean ascending) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (ascending) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                } else {
                    if (arr[j] < arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}