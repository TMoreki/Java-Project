public class ArrayManipulation6 {

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1, 0};

        printArray("array before first add ", array);

        // This add will work
        array = add(array, 12);
        printArray("array after first add ", array);

        // This add will now work
        array = add(array, 13);
        printArray("array after second add ", array);
    }

    public static int[] add(int[] arrayToAddTo, int itemToAdd) {
        int initialSize = arrayToAddTo.length;

        // First, let's just iterate through the array
        // If we find a slot with a zero, we use it and return
        // If this is the case, then we do not resize; all is good
        for (int i = 0; i < arrayToAddTo.length; i++) {
            if (arrayToAddTo[i] == 0) {
                arrayToAddTo[i] = itemToAdd;
                return arrayToAddTo;
            }
        }

        // If we reach this block, it means there was no 0 (zero) slot available
        // This means the array is full, and we need to extend it by 10
        int newSize = arrayToAddTo.length + 10;
        int[] newArray = new int[newSize];

        // Copy elements from the old array to the new array
        System.arraycopy(arrayToAddTo, 0, newArray, 0, initialSize);

        // Add the new element at the end of the new array
        newArray[initialSize] = itemToAdd;

        // Return the new array
        return newArray;
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