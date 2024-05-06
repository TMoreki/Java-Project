public class AdvancedArrayPop2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[9] = 50; // Assigning value to the last index

        byte[] byteArray = new byte[10];
        byteArray[9] = 50; // Assigning value to the last index

        short[] shortArray = new short[10];
        shortArray[9] = 50; // Assigning value to the last index

        long[] longArray = new long[10];
        longArray[9] = 1234567890L; // Assigning value to the last index

        float[] floatArray = new float[10];
        floatArray[9] = 50.123456789f; // Assigning value to the last index

        double[] doubleArray = new double[10];
        doubleArray[9] = 50.123456789; // Assigning value to the last index

        boolean[] booleanArray = new boolean[10];
        booleanArray[9] = true; // Assigning value to the last index

        char[] charArray = new char[10];
        charArray[9] = 'A'; // Assigning value to the last index

        int[] stringArray = new int[10];
        stringArray[9] = 65; // Assigning value to the last index (ASCII 'A')

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

// PSEUDOCODE


// program AdvancedArrayPop2
//     function main
//         declare intArray as an array of integers with size 50
//         declare byteArray as an array of bytes with size 50
//         declare shortArray as an array of shorts with size 50
//         declare longArray as an array of longs with size 1234567890L
//         declare floatArray as an array of floats with size 50.123456789f
//         declare doubleArray as an array of doubles with size 50.123456789
//         declare booleanArray as an array of booleans with size true
//         declare charArray as an array of characters with size 'A'
//         declare stringArray as an array of integers with size 65

//         print "Random values for primitive and object arrays:"

//         print "int array: "
//         call printArray with intArray

//         print "byte array: "
//         call printArray with byteArray

//         print "short array: "
//         call printArray with shortArray

//         print "long array: "
//         call printArray with longArray

//         print "float array: "
//         call printArray with floatArray

//         print "double array: "
//         call printArray with doubleArray

//         print "boolean array: "
//         call printBooleanArray with booleanArray

//         print "char array: "
//         call printCharArray with charArray

//         print "String array: "
//         call printStringArray with stringArray

//     function printArray(array as an array of integers)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printArray(array as an array of bytes)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printArray(array as an array of shorts)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printArray(array as an array of longs)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printArray(array as an array of floats)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printArray(array as an array of doubles)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printBooleanArray(array as an array of booleans)
//         for each value in arr
//             if value is true
//                 print 1 followed by a space
//             else
//                 print 0 followed by a space
//         print a newline

//     function printCharArray(array as an array of characters)
//         for each value in arr
//             print the integer representation of value followed by a space
//         print a newline

//     function printStringArray(array as an array of integers)
//         for each value in arr
//             print value followed by a space
//         print a newline
