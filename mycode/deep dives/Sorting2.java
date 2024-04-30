public class Sorting2 {

    public static void main(String[] args) {

        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println("Original array:");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        array[19] += 60; 
        array[40] += 61; 

        System.out.println("Modified array:");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Sort the array in descending order
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        
        System.out.println("Array in descending order:");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}