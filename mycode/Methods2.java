public class Methods2{
	public static void main(String [] args){
        
        int[] array = new int[50];  
        
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;       
        } 

        printArray(array);
        System.out.println("\nIncremented array:");
        incrementedArray(array);

    }

        public static void printArray(int [] array){
        	for(int i = 0; i < array.length ; i++){
        		array[i]++;
        		System.out.print(array[i] + " ");
        	}
        }

        	

        	
        }

        public static void incrementedArray(int [] array){
        	for(int number : array){
        		if(number % 2 == 0 || number % 11 == 0){
        			System.out.print(number + " ");
        		}

              }

        	}

       
        
//         for (int i = 0; i < array.length; i++) {  
//             array[i]++;
//         }

        
//         System.out.println("Incremented array with even numbers divisible by 11:");
//         for (int number : array) {
//             if (number % 2 == 0 || number % 11 == 0) {   
//                 System.out.print(number + " ");
//             }
//         }
//     }
// }





  
