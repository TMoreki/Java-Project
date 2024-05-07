public class FB {
    
    public static void main(String[] args) {
        // This loop iterates from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // If the number is divisible by both 3 and 5, print "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // If the number is divisible by 3, print "Fizz"
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // If the number is divisible by 5, print "Buzz"
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // If the number is not divisible by 3 or 5, print the number
            else {
                System.out.println(i);
            }
        }
    }
}


// BEGIN FizzBuzz
//     SET counter TO 1

//     WHILE counter <= 100
//         IF counter is divisible by 3 AND counter is divisible by 5
//             PRINT "FizzBuzz"
//         ELSE IF counter is divisible by 3
//             PRINT "Fizz"
//         ELSE IF counter is divisible by 5
//             PRINT "Buzz"
//         ELSE
//             PRINT counter

//         INCREMENT counter BY 1
//     END WHILE

// END FizzBuzz




// ALTERNATIVE


//  public class FB {
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

// ALTERNATIVE

// public class FB {
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
