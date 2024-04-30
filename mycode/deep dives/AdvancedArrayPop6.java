public class AdvancedArrayPop6 {
    public static void main(String[] args) {
        int[] source = new int[10];
        int[] destination = new int[10];
        int[] destination2 = new int[10];
        int[] destination3 = new int[10];

        
        for (int i = 0; i < source.length; i++) {
            source[i] = i + 20;
        }

        printArray("Source int before copy: ", source);
        printArray("Destination in before copy: ", destination);
        printArray("Destination2 in before copy: ", destination2);
        printArray("Destination3 in before copy: ", destination3);

        
        for (int i = 0; i < 3; i++) {
            destination[i] = source[i];
            destination2[i] = (int) source[i]; 
            destination3[i] = Integer.parseInt(String.valueOf(source[i])); 
        }

        printArray("Source after copy: ", source);
        printArray("Destination after copy: ", destination);
        printArray("Destination2 after copy: ", destination2);
        printArray("Destination3 after copy: ", destination3);
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



// PSEUDOCODE

// program AdvancedArrayPop6
//     function main
//         declare source as an array of integers with size 10
//         declare destination as an array of integers with size 10
//         declare destination2 as an array of integers with size 10
//         declare destination3 as an array of integers with size 10

//         for i from 0 to length of source - 1
//             set the value at index i of source to i + 20

//         call printArray with "Source int before copy: " and source as arguments
//         call printArray with "Destination in before copy: " and destination as arguments
//         call printArray with "Destination2 in before copy: " and destination2 as arguments
//         call printArray with "Destination3 in before copy: " and destination3 as arguments

//         for i from 0 to 2
//             set the value at index i of destination to the value at index i of source
//             set the value at index i of destination2 to the integer value of the value at index i of source
//             set the value at index i of destination3 to the integer value of the string representation of the value at index i of source

//         call printArray with "Source after copy: " and source as arguments
//         call printArray with "Destination after copy: " and destination as arguments
//         call printArray with "Destination2 after copy: " and destination2 as arguments
//         call printArray with "Destination3 after copy: " and destination3 as arguments

//     function printArray(prefix as a string, arrayToPrint as an array of integers)
//         print prefix
//         print "["
//         for i from 0 to length of arrayToPrint - 1
//             print the value at index i of arrayToPrint
//             if i is not equal to length of arrayToPrint - 1
//                 print ","
//         print "]"
//         print a newline character
