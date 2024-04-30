public class ArrayManipulation1 {

    public static void main(String[] args) {

        int[] array = new int[10];

        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); 
        }

        printArray("array with random numbers ", array);

    
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        printArray("array with zeros ", array);

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

