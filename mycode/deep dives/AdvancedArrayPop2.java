public class AdvancedArrayPop2 {

    public static void main(String[] args) {
        int[] array = new int[10];

        array[5] = 100; 

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


// PSEUDOCODE

// program AdvancedArrayPop2
//     function main
//         declare array as an array of integers with size 10
//         set the value at index 9 of array to 42
//         call printArray with "array: " and array as arguments

//     function printArray(prefix as a string, arrayToPrint as an array of integers)
//         print prefix
//         print "["
//         for i from 0 to length of arrayToPrint - 1
//             print the value at index i of arrayToPrint
//             if i is not equal to length of arrayToPrint - 1
//                 print ","
//         print "]"
//         print a newline character

