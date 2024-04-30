public class ArrayManipulation81 {

    public static void main(String[] args) {
        int[] arrayA = {3, 4, 2, 6, 4, 7, 9, 1, 0};
        int[] arrayB = {3, 14, 12, 6, 14, 7, 19, 11, 0};

        printArray("arrayA before subtracting ", arrayA);
        printArray("arrayB before subtracting ", arrayB);

        int[] result = sub(arrayA, arrayB);

        printArray("arrayA after subtracting ", result);
        printArray("arrayB after subtracting ", arrayB);
    }

    public static int[] sub(int[] arrayA, int[] arrayB) {
        int duplicateCount = 0;

        
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    duplicateCount++;
                    break;
                }
            }
        }

        
        int[] newArray = new int[arrayA.length - duplicateCount];

        int index = 0;
        for (int element : arrayA) {
            boolean isDuplicate = false;
            for (int j = 0; j < arrayB.length; j++) {
                if (element == arrayB[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
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