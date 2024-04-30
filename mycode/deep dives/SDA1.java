public class SDA1{
    public static void main(String [] args){

        int[] array = new int [50];

        for(int i = 0 ; i < array.length ; i++){
            array[i] = i + 1;
        }

        System.out.println("Before change");
        for(int number : array){
            System.out.print(number + " ");
        }

        System.out.println();

        for(int i = 0; i < array.length; i++){
            array[i]++;
        }

        System.out.println("After changes");
        for(int number : array){
            System.out.print(number + " ");
        }
    }
}