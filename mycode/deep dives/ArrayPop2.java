public class ArrayPop2 {
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