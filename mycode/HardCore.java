public class HardCore{
    public static void main(String [] args){
  
        int [] array = new int[50];

        for(int  i = 0; i < array.length ; i++){
        array[i] = i * 2;
        }


        System.out.println("Before");
        for(int number : array){
        if(number % 2 == 0 || number % 11 == 0){
        System.out.print(number + " ");
          }
        }
        System.out.println();

        for(int i = 0; i < array.length ; i++){
        array[i]++;
        }
   

        System.out.println("After");
        for(int number : array){
        if(number % 2 == 0 || number % 11 == 0){
        System.out.print(number + " ");
            }
        }
    }
}