public class AdvancedArrayPop1While {
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


