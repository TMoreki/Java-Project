public class FB{
	public static void main(String [] args){
          
        for (int i = 1; i <= 100; i++){
          if (i % 3 == 0 && i % 5 ==0){

        System.out.println("FizzBuzz");
        }else if (i % 3 == 0) {
        System.out.println("Fizz");
        } else if (i % 5 == 0) {
        System.out.println("Buzz");
        } else { 
        System.out.println(i);
     }
    } 
   }
 }             


//  public class FizzBuzz {
//     public static void main(String[] args) {
//         int i = 1;
//         while (i <= 100) {
//             if (i % 3 == 0 && i % 5 == 0) {
//                 System.out.println("FizzBuzz");
//             } else if (i % 3 == 0) {
//                 System.out.println("Fizz");
//             } else if (i % 5 == 0) {
//                 System.out.println("Buzz");
//             } else {
//                 System.out.println(i);
//             }
//             i++;
//         }
//     }
// }


// public class FizzBuzz {
//     public static void main(String[] args) {
//         int i = 1;
//         do {
//             if (i % 3 == 0 && i % 5 == 0) {
//                 System.out.println("FizzBuzz");
//             } else if (i % 3 == 0) {
//                 System.out.println("Fizz");
//             } else if (i % 5 == 0) {
//                 System.out.println("Buzz");
//             } else {
//                 System.out.println(i);
//             }
//             i++;
//         } while (i <= 100);
//     }
// }