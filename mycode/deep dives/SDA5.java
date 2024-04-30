public class SDA5 {
    public static void main(String[] args) {
        
        int[] array = new int[50];

        
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; 
        }

        
        System.out.println("Even numbers and numbers divisible by 11:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 || array[i] % 11 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}