public class ArrayChallenge362 {
    public static void main(String[] args) {
        int[] even = new int[100];
        int[] odd = new int[100];    //here i just delcared int arrays even odd and prime
        int[] prime = new int[100];  //single array with 100

        int evenIndex = 0, oddIndex = 0, primeIndex = 0; // here i delcared int variables and initialized them to 0

        for (int i = 2; evenIndex < 100 && oddIndex < 100 && primeIndex < 100; i++) {
            if (i % 2 == 0) {// each integer i starting from 2 then incrementting all variable
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
        System.out.println("\nOdd numbers:");  //just printing
        printArray(odd);
        System.out.println("\nPrime numbers:");
        printArray(prime);
    }

    private static boolean isPrime(int n) { //define isPrime method with parameter n
        if (n <= 1) {
            return false; // If n is less than or equal to 1, return false
        }
        if (n <= 3) {   
            return true; // If n is less than or equal to 3, return true
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; //If n is divisible by 2 or 3, return false

        }

        for (int i = 5; i * i <= n; i += 6) { // For each int i from 5 to the square root of n, incrementing by 6

            if (n % i == 0 || n % (i + 2) == 0) {  // If n is divisible by i or n is divisible by (i + 2) return false 
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
