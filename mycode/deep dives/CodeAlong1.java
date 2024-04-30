public class CodeAlong1 {

    public static void main(String[] args) {
        int[][] numbers = new int[10][10]; 
        
        
        int value = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = value++;
            }
        }
        
        count(numbers); 
    }

    public static void count(int[][] max) {
        for (int[] row : max) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println(); 
        }
    }

}