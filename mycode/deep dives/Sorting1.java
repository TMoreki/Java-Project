public class Sorting1 {
    public static void main(String[] args) {
        
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; 
        }


        System.out.println("Original array:");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        
        array[19] += 60; 
        array[40] += 61; 

    
        System.out.println("Modified array:");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}