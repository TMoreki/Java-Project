import java.util.Random;

public class ArrayChallenge361 {
    public static void main(String[] args) {
        
        int[][][] array3D = new int[10][10][3];

        
        int[][] array2D = new int[10][10];

        
        Random random = new Random(); // use Math.random()
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    array3D[i][j][k] = random.nextInt(100);
                }
                array2D[i][j] = random.nextInt(100);
            }
        }

        
        System.out.println("3D Array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("2D Array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}