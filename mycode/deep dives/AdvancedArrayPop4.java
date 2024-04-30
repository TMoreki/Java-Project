public class AdvancedArrayPop4 {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = -1;
        }
        printArray("intArray: ", intArray);

        double[] doubleArray = new double[10];
        
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = -1.0;
        }
        printArray("doubleArray: ", doubleArray);

        boolean[] booleanArray = new boolean[10];
    
        for (int i = 0; i < booleanArray.length; i++) {
            booleanArray[i] = true;
        }
        printArray("booleanArray: ", booleanArray);

        char[] charArray = new char[10];
        
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = 'a';
        }
        printArray("charArray: ", charArray);

        String[] stringArray = new String[10];
        
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "";
        }
        printArray("stringArray: ", stringArray);
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
        System.out.print("]");
        System.out.println();
    }

    public static void printArray(String prefix, double[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
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
        System.out.print("]");
        System.out.println();
    }

    public static void printArray(String prefix, char[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printArray(String prefix, String[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}




// PSEUDOCODE

// program AdvancedArrayPop4
//     function main
//         declare intArray as an array of integers with size 10
//         for i from 0 to length of intArray - 1
//             set the value at index i of intArray to -1
//         call printArray with "intArray: " and intArray as arguments

//         declare doubleArray as an array of doubles with size 10
//         for i from 0 to length of doubleArray - 1
//             set the value at index i of doubleArray to -1.0
//         call printArray with "doubleArray: " and doubleArray as arguments

//         declare booleanArray as an array of booleans with size 10
//         for i from 0 to length of booleanArray - 1
//             set the value at index i of booleanArray to true
//         call printArray with "booleanArray: " and booleanArray as arguments

//         declare charArray as an array of characters with size 10
//         for i from 0 to length of charArray - 1
//             set the value at index i of charArray to 'a'
//         call printArray with "charArray: " and charArray as arguments

//         declare stringArray as an array of strings with size 10
//         for i from 0 to length of stringArray - 1
//             set the value at index i of stringArray to an empty string ""
//         call printArray with "stringArray: " and stringArray as arguments

//     function printArray(prefix as a string, arrayToPrint as an array of integers)
//         print prefix
//         print "["
//         for i from 0 to length of arrayToPrint - 1
//             print the value at index i of arrayToPrint
//             if i is not equal to length of arrayToPrint - 1
//                 print ","
//         print "]"
//         print a newline character

//     function printArray(prefix as a string, arrayToPrint as an array of doubles)
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

//     function printArray(prefix as a string, arrayToPrint as an array of characters)
//         print prefix
//         print "["
//         for i from 0 to length of arrayToPrint - 1
//             print the value at index i of arrayToPrint
//             if i is not equal to length of arrayToPrint - 1
//                 print ","
//         print "]"
//         print a newline character

//     function printArray(prefix as a string, arrayToPrint as an array of strings)
//         print prefix
//         print "["
//         for i from 0 to length of arrayToPrint - 1
//             print the value at index i of arrayToPrint
//             if i is not equal to length of arrayToPrint - 1
//                 print ","
//         print "]"
//         print a newline character

