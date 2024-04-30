public class PcodeTest2{
   public static void main(String[] argv){
int[][] array = new int[10][50];


for (int i = 0; i < 10; i++) {
   for (int j = 0; j < 50; j++) {
       array[i][j] = (int) (Math.random() * 100);
   }
}


System.out.println("Original array:");
for (int i = 0; i < 10; i++) {
   for (int j = 0; j < 50; j++) {
       System.out.print(array[i][j] + " ");
   }
   System.out.println(); 
}


for (int i = 0; i < 10; i++) {
   Arrays.sort(array[i]);
}

System.out.println("\nSorted array:");
for (int i = 0; i < 10; i++) {
   for (int j = 0; j < 50; j++) {
       System.out.print(array[i][j] + " ");
   }
   System.out.println(); 
  }
}
}