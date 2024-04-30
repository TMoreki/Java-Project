public class SDA4 {
    public static void main(String[] args) {
        
        int[] array = new int[50];

        
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; 
        }

        
        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 


        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }


        System.out.println("Incremented Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}