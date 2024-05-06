public class CodeAlong2 {
    // This is the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Declare and initialize an array of integers called array with a length of 100
        int[] array = new int[100];

        // Fill the array with random integers between 0 and 99
        for (int i = 0; i < array.length; i++) {//used a for loop
            array[i] = (int) (Math.random() * 100);
        }

        // Print the original array
        System.out.println("Original Array:");
        for (int number : array) {// used an enhancedloop
            System.out.print(number + " ");
        }
        System.out.println("\n"); // Move to the next line

        // Declare and initialize a new array of integers called subArr with a length of 16
        int[] subArr = new int[16];

        // Copy 16 elements from array starting at index 15 to subArr
        System.arraycopy(array, 15, subArr, 0, 16);

        // Print the sub-array (positions 15 to 31)
        System.out.println("Sub-Array (positions 15 to 31):");
        for (int number : subArr) {
            System.out.print(number + " ");
        }
        System.out.println(); // Move to the next line
    }
}


// DECLARE CLASS CodeAlong2

// DECLARE METHOD main
//     DECLARE INTEGER ARRAY array OF SIZE 100
//     FOR i FROM 0 TO array.length - 1
//         SET array[i] TO RANDOM INTEGER BETWEEN 0 AND 99
//     END FOR
//     PRINT "Original Array:"
//     FOR each number IN array
//         PRINT number FOLLOWED BY SPACE
//     END FOR
//     PRINT NEW LINE
//     DECLARE INTEGER ARRAY subArr OF SIZE 16
//     COPY 16 ELEMENTS FROM array STARTING AT INDEX 15 TO subArr STARTING AT INDEX 0
//     PRINT "Sub-Array (positions 15 to 31):"
//     FOR each number IN subArr
//         PRINT number FOLLOWED BY SPACE
//     END FOR
//     PRINT NEW LINE
// END CLASS
