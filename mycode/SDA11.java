public class SDA11{

    
    public static void main(String[] args) {
        int[][] array = new int[100][30]; 

    
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                array[i][j] = i * 30 + j; 
            }
        }

        
        System.out.println("Odd-numbered Values and Numbers Divisible by 8:");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                int number = array[i][j];
                if (number % 2 != 0 || number % 8 == 0) {
                    System.out.print(value + " ");
                }
            }
            System.out.println(); 
        }
    }
}