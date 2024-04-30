public class SDA10 {
    public static void main(String[] args) {
        int[][] array = new int[100][30]; 

        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                array[i][j] = i * 30 + j; 
            }
        }


        System.out.println("Original Array:");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }

        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                array[i][j]++;
            }
        }

        
        System.out.println("\nIncremented Array:");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}