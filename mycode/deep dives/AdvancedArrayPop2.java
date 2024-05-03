// public class AdvancedArrayPop2 {

//     public static void main(String[] args) {
//         int[] array = new int[10];

//         array[5] = 100; 

//         printArray("array: ", array);
//     }

//     public static void printArray(String prefix, int[] arrayToPrint) {
//         System.out.print(prefix);
//         System.out.print("[");
//         for (int i = 0; i < arrayToPrint.length; i++) {
//             System.out.print(arrayToPrint[i]);
//             if (i != arrayToPrint.length - 1) {
//                 System.out.print(",");
//             }
//         }
//         System.out.print("]\\n");
//     }
// }


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


public class AdvancedArrayPop2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[9] = 50; // Assigning value to the last index

        byte[] byteArray = new byte[10];
        byteArray[9] = 50; // Assigning value to the last index

        short[] shortArray = new short[10];
        shortArray[9] = 50; // Assigning value to the last index

        long[] longArray = new long[10];
        longArray[9] = 9876543210L; // Assigning value to the last index

        float[] floatArray = new float[10];
        floatArray[9] = 3.14f; // Assigning value to the last index

        double[] doubleArray = new double[10];
        doubleArray[9] = 50.718281828459045; // Assigning value to the last index

        boolean[] booleanArray = new boolean[10];
        booleanArray[9] = true; // Assigning value to the last index

        char[] charArray = new char[10];
        charArray[9] = 'A'; // Assigning value to the last index

        int[] stringArray = new int[10];
        stringArray[9] = 65; // Assigning value to the last index (ASCII code for 'A')

        System.out.println("Default values for primitive and object arrays:");

        System.out.print("int array: ");
        printArrayWithWhile(intArray);

        System.out.print("byte array: ");
        printArrayWithWhile(byteArray);

        System.out.print("short array: ");
        printArrayWithWhile(shortArray);

        System.out.print("long array: ");
        printArrayWithWhile(longArray);

        System.out.print("float array: ");
        printArrayWithWhile(floatArray);

        System.out.print("double array: ");
        printArrayWithWhile(doubleArray);

        System.out.print("boolean array: ");
        printArrayWithWhile(booleanArray);

        System.out.print("char array: ");
        printArrayWithWhile(charArray);

        System.out.print("String array: ");
        printArrayWithWhile(stringArray);
    }

  

    public static void printArrayWithWhile(byte[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void printArrayWithWhile(short[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void printArrayWithWhile(long[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void printArrayWithWhile(float[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void printArrayWithWhile(double[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void printArrayWithWhile(boolean[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print((arr[i] ? 1 : 0) + " ");
            i++;
        }
        System.out.println();
    }

    public static void printArrayWithWhile(char[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print((int) arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void printArrayWithWhile(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}


