public class SDAHard{
    public static void main(String [] args){

     int[][][] array3D = new int[10][10][3];
     int[][] array2D = new int[10][10];


     for(int i = 0; i < 10; i++){
         for(int j = 0; i < 10; j++){
             for(int k = 0; k < 3; k++){
                 array3D[i][j][k]= (int)(Math.random() * 100);
         }
        array2D[i][j] = (int)(Math.random() * 100);
       }
     }
       System.out.println("3D array");
       for(int i = 0; i < 10; i++){
           for(int j = 0; j < 10; j++){
               for(int k = 0; k < 3; k++){
       System.out.print(array[i][j]][k] + " ");
    }  

       System.out.println();
}

