public class CodeAlong2 {
   public static void main(String[] args) {
       
       int[] array = new int[100];

       
       for (int i = 0; i < array.length; i++) {
           array[i] = (int) (Math.random() * 100);
       }

    
       System.out.println("Original Array:");
       for (int number : array) {
           System.out.print(number + " ");
       }
       System.out.println("\n");

       
       int[] subArr = new int[16];

       
       System.arraycopy(array, 15, subArr, 0, 16);

    
       System.out.println("Sub-Array (positions 15 to 31):");
       for (int number : subArr) {
           System.out.print(number + " ");
       }
       System.out.println();
   }
}