public class StringArray1 {
    public static void main(String[] args) {
        // Initialize a string with comma-separated numbers
        String line = "1,4,3,2,3,7,5,6,9";

        // Convert the string into an array of numbers
        String[] numbersStr = line.split(","); // Split the string by comma and store in an array
        int[] numbers = new int[numbersStr.length]; // Create an integer array to store the numbers

        // Convert each string element to an integer and store in the numbers array
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        // Sort the array in ascending order
        sort(numbers, true); // Call the sort method with ascending order flag set to true

        System.out.println("Sorted in ascending order:");
        // Print the sorted array in ascending order
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array in descending order
        sort(numbers, false); // Call the sort method with ascending order flag set to false

        System.out.println("Sorted in descending order:");
        // Print the sorted array in descending order
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Method to sort the array using bubble sort algorithm
    private static void sort(int[] arr, boolean ascending) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (ascending) { // If ascending order
                    if (arr[j] > arr[j + 1]) { // Swap elements if arr[j] is greater than arr[j+1]
                        swap(arr, j, j + 1);
                    }
                } else { // If descending order
                    if (arr[j] < arr[j + 1]) { // Swap elements if arr[j] is less than arr[j+1]
                        swap(arr, j, j + 1);
                    }
                }
            }
        }
    }

    //swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}