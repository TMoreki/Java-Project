public class ArrayManipulation7 {

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1, 0};

        printArray("array before trim ", array);

        
        array = trim(array);

        printArray("array after trim ", array);
    }

    public static int[] trim(int[] arrayToTrim) {
        int initialSize = arrayToTrim.length;

        
        for (int i = 0; i < arrayToTrim.length; i++) {
            if (arrayToTrim[i] == 0) {
                return arrayToTrim;
            }
        }

        int newSizeLess = 0;

        
        for (int element : arrayToTrim) {
            if (element == 0) {
                newSizeLess++;
            }
        }

        int newSize = initialSize - newSizeLess;

        
        int[] newArray = new int[newSize];

        
        int index = 0;
        for (int element : arrayToTrim) {
            if (element != 0) {
                newArray[index++] = element;
            }
        }

        
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