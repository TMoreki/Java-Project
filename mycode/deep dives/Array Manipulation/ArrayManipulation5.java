public class ArrayManipulation5 {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1};

        printArray("array before adding ", array);

        array = add(array, 11);

        printArray("array after adding", array);
    }

    public static int[] add(int[] arrayToAddTo, int itemToAdd) {
        int initialSize = arrayToAddTo.length;
        int newSize = initialSize + 1;

        
        int[] newArray = new int[newSize];

        
        for (int i = 0; i < initialSize; i++) {
            newArray[i] = arrayToAddTo[i];
        }

        
        newArray[newSize - 1] = itemToAdd;

    
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