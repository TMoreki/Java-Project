public class HardCoding{
    public static void main(String [] args){
 
    int [] array = new int[50];

    int i = 0;
    while(i < array.length){
    array[i] = i * 2;
    i++;
   }

    System.out.println("Even and div by eleven");
    i = 0;
    while( i < array.length){
    switch(array[i] % 2){
    case 0:
    System.out.print(array[i] + " ");
    break;
    default:
    switch(array[i] % 11){
    case 0:
    System.out.print(array[i] + " ");
    break;
    }
  }
} 
i++;
}
}
     
     
         