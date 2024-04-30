public class JustTest{
	public static void main(String [] args){

        
        int[][] array = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = i * 10 + j; 
            }
        }
        
        System.out.println("Original Array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }

        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j]++;
            }
        }

       
        System.out.println("\nIncremented Array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }
    }
} 
	
