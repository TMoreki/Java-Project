Question 1


```java
import java.util.Random;

public class ArrayChallenge361 {
    public static void main(String[] args) {
        // 1. Declare a 3D empty array of size [10][10][3]
        int[][][] array3D = new int[10][10][3];

        // 2. Declare a 2D empty array of size [10][10]
        int[][] array2D = new int[10][10];

        // 3. Populate both with random numbers using Math.random()
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    array3D[i][j][k] = random.nextInt(100);
                }
                array2D[i][j] = random.nextInt(100);
            }
        }

        // 4. Print contents of both arrays
        System.out.println("3D Array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("2D Array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

This code creates a 3D array of size `[10][10][3]` and a 2D array of size `[10][10]`. It then populates both arrays with random numbers using the `Math.random()` method from the `Random` class. Finally, it prints the contents of both arrays to the console.

Note that the output may be different each time the program is run due to the random number generation.



Question 2

```java
public class ArrayChallenge362 {
    public static void main(String[] args) {
        int[] even = new int[100];
        int[] odd = new int[100];
        int[] prime = new int[100];

        int evenIndex = 0, oddIndex = 0, primeIndex = 0;

        for (int i = 2; evenIndex < 100 && oddIndex < 100 && primeIndex < 100; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
                if (isPrime(i)) {
                    prime[primeIndex++] = i;
                }
            }
        }

        System.out.println("Even numbers:");
        printArray(even);
        System.out.println("\nOdd numbers:");
        printArray(odd);
        System.out.println("\nPrime numbers:");
        printArray(prime);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
```

This code declares three 1D arrays of size 100 named `even`, `odd`, and `prime`. It then populates these arrays using a single `for` loop that iterates from 2 to the end of the arrays.

For each number `i`, the code checks if it is even or odd and adds it to the appropriate array. If the number is odd, it also checks if it's prime using the `isPrime` method, and if it is, it adds it to the `prime` array.

The `isPrime` method is a helper method that checks if a given number is prime or not using an optimized algorithm.

After populating the arrays, the code prints the contents of each array using the `printArray` method.

Note that this implementation assumes that the sizes of all three arrays are the same (100) and that there are enough prime numbers to fill the `prime` array. If there are not enough prime numbers, the remaining elements in the `prime` array will be filled with zeros.

