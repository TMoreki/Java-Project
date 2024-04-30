public class KG2{
    public static void main(String [] args){
        int[][] array = new int [10][50];

        for(int i = 0; i < array.length; i++){
        	for(int j = 0; j < array[i].length; j++){
        		//array[i][j] = i * array[i].length + j + 1; //(used to populate note that there is no need to populate if you going to get random numbers as youll only repeating the process )
                array[i][j] = (int) (Math.random() * 10) + 1; //(simpler to use for me compared to java.util.random or threadlocalrandom )
                //Random rand = new Random(); (also compare this random sorting and check which is more efficient for me)
                System.out.print(array[i][j] + " "); 
            } 


        }
                System.out.println("\nOriginal array:");
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                    	System.out.print(array[i][j] + " ");
                     }
                
                }   
                System.out.println(); 

       for (int i = 0; i < array.length; i++) {
           for(int j = 0; j < array[i].length - 1; j++){ 
            if(array[i][j] > array[i][j + 1]){ 
                int temp = array [i][j];
                array[i][j] = array[i][j + 1];
                array[i][j + 1] = temp;
            }
           }
        }

       System.out.println("\nSorted array:");
        for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++) {
            System.out.print(array[i][j] + " ");
    }
              System.out.println(); 
}

   }	
}
