public class AdvancedArrayPop2 {

    public static void main(String[] args) {
        int[] array = new int[10];

        array[9] = 42; 

        printArray("array: ", array);
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
        System.out.print("]\\n");
    }
}