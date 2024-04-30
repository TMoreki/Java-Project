import java.util.Random;
public class BubbleSort{
    public static void main(String [] args){
        
         
        int[] numbers = new int [10];

        for(int i = 0; i < numbers.length; i++){
        	numbers[i] = rand.nextInt(1000000);
        }
        System.out.println("Before:");
        printArray(numbers);

        boolean swappedSomething = true;

        while (swappedSomething){
        	swappedSomething = false;

        	for(int i = 0; i < numbers.length - 1; i++) {
        		if(numbers[i] > numbers [i + 1]){
        			swappedSomething = true;
        			int temp = numbers [i];
        			numbers[i] = numbers[i];
        			numbers[i + 1] = temp;
        		}
        	}
        }
    }	
}
    

     