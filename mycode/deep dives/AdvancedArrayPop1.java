public class AdvancedArrayPop1 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        byte[] byteArray = new byte[10];
        short[] shortArray = new short[10];
        long[] longArray = new long[10];
        float[] floatArray = new float[10];
        double[] doubleArray = new double[10];
        boolean[] booleanArray = new boolean[10];
        char[] charArray = new char[10];
        int[] stringArray = new int[10];

        System.out.println("Default values for primitive and object arrays:");

        System.out.print("int array: ");
        printArray(intArray);

        System.out.print("byte array: ");
        printArray(byteArray);

        System.out.print("short array: ");
        printArray(shortArray);

        System.out.print("long array: ");
        printArray(longArray);

        System.out.print("float array: ");
        printArray(floatArray);

        System.out.print("double array: ");
        printArray(doubleArray);

        System.out.print("boolean array: ");
        printBooleanArray(booleanArray);

        System.out.print("char array: ");
        printCharArray(charArray);

        System.out.print("String array: ");
        printStringArray(stringArray);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(byte[] arr) {
        for (byte value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(short[] arr) {
        for (short value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(long[] arr) {
        for (long value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(float[] arr) {
        for (float value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printBooleanArray(boolean[] arr) {
        for (boolean value : arr) {
            System.out.print((value ? 1 : 0) + " ");
        }
        System.out.println();
    }

    public static void printCharArray(char[] arr) {
        for (char value : arr) {
            System.out.print((int) value + " ");
        }
        System.out.println();
    }

    public static void printStringArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}



// PSEUDOCODE


// program AdvancedArrayPop1
//     function main
//         declare intArray as an array of integers with size 10
//         declare byteArray as an array of bytes with size 10
//         declare shortArray as an array of shorts with size 10
//         declare longArray as an array of longs with size 10
//         declare floatArray as an array of floats with size 10
//         declare doubleArray as an array of doubles with size 10
//         declare booleanArray as an array of booleans with size 10
//         declare charArray as an array of characters with size 10
//         declare stringArray as an array of integers with size 10 (casting)

//         print "Default values for primitive and object arrays:"

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

//     function printArray(arr as an array of integers)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printArray(arr as an array of bytes)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printArray(arr as an array of shorts)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printArray(arr as an array of longs)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printArray(arr as an array of floats)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printArray(arr as an array of doubles)
//         for each value in arr
//             print value followed by a space
//         print a newline

//     function printBooleanArray(arr as an array of booleans)
//         for each value in arr
//             if value is true
//                 print 1 followed by a space
//             else
//                 print 0 followed by a space
//         print a newline

//     function printCharArray(arr as an array of characters)
//         for each value in arr
//             print the integer representation of value followed by a space
//         print a newline

//     function printStringArray(arr as an array of integers)
//         for each value in arr
//             print value followed by a space
//         print a newline

