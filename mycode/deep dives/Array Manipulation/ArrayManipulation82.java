public class ArrayManipulation82 {

    public static void main(String[] args) {
        int[] arrayA = {3, 4, 2, 6, 4, 7, 9, 1, 0};
        int[] arrayB = {13, 14, 12, 16, 14, 17, 19, 11, 10};

        printArray("arrayA before merging ", arrayA);
        printArray("arrayB before merging ", arrayB);

        int[] mergedArray = merge(arrayA, arrayB);
        printArray("Merged array (unsorted) ", mergedArray);

        mergedArray = sort(mergedArray); 
        printArray("Merged array (sorted) ", mergedArray);
    }

    public static int[] merge(int[] arrayA, int[] arrayB) {
        int[] mergedArray = new int[arrayA.length + arrayB.length];

        System.arraycopy(arrayA, 0, mergedArray, 0, arrayA.length);
        System.arraycopy(arrayB, 0, mergedArray, arrayA.length, arrayB.length);

        return mergedArray;
    }

    public static int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
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