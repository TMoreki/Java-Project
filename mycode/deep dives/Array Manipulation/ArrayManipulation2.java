public class ArrayManipulation2 {

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1};

        printArray("array before swapping ", array);

        reverseArray(array);

        printArray("array after swapping ", array);
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            
            start++;
            end--;
        }
    }

    public static void printArray(String prefix, int[] arrayToPrint) {
        System.out.print(prefix);

        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }

        System.out.print("]\n");
    }
}