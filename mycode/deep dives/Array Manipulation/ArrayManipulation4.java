public class ArrayManipulation4 {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1};

        printArray("array before overwriting ", array);

        array[array.length - 1] = -1;
        array[array.length - 2] = -1;

        printArray("array after overwriting ", array);

        int[] shrunkArray = shrinkArray(array);
        printArray("array after shrinking ", shrunkArray);
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

    public static int[] shrinkArray(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num != -1) {
                count++;
            }
        }

        int[] shrunkArray = new int[count];
        int index = 0;
        for (int num : array) {
            if (num != -1) {
                shrunkArray[index++] = num;
            }
        }
        return shrunkArray;
    }
}