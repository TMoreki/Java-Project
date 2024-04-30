public class AdvancedArrayPop3 {

    public static void main(String[] args) {
        int[] array = new int[10];

        
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        printArray("array: ", array);
        printArray("boolean: ", getBooleanArray(array));
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

    public static void printArray(String prefix, long[] arrayToPrint) {
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

    public static void printArray(String prefix, boolean[] arrayToPrint) {
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

    public static boolean[] getBooleanArray(int[] array) {
        boolean[] booleanArray = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            booleanArray[i] = (i % 2 == 0);
        }
        return booleanArray;
    }
}



// PSEUDOCODE

// program AdvancedArrayPop3
//     function main
//         declare array as an array of integers with size 10
//         for i from 0 to length of array - 1
//             set the value at index i of array to i
//         call printArray with "array: " and array as arguments
//         declare booleanArray as the result of calling getBooleanArray with array as argument
//         call printArray with "boolean: " and booleanArray as arguments

//     function printArray(prefix as a string, arrayToPrint as an array of integers)
//         print prefix
//         print "["
//         for i from 0 to length of arrayToPrint - 1
//             print the value at index i of arrayToPrint
//             if i is not equal to length of arrayToPrint - 1
//                 print ","
//         print "]"
//         print a newline character

//     function printArray(prefix as a string, arrayToPrint as an array of longs)
//         print prefix
//         print "["
//         for i from 0 to length of arrayToPrint - 1
//             print the value at index i of arrayToPrint
//             if i is not equal to length of arrayToPrint - 1
//                 print ","
//         print "]"
//         print a newline character

//     function printArray(prefix as a string, arrayToPrint as an array of booleans)
//         print prefix
//         print "["
//         for i from 0 to length of arrayToPrint - 1
//             print the value at index i of arrayToPrint
//             if i is not equal to length of arrayToPrint - 1
//                 print ","
//         print "]"
//         print a newline character

//     function getBooleanArray(array as an array of integers)
//         declare booleanArray as an array of booleans with size equal to the length of array
//         for i from 0 to length of array - 1
//             set the value at index i of booleanArray to true if i is even, false otherwise
//         return booleanArray


