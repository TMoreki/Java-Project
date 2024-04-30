public class SDA6 {
    public static void main(String[] args) {
        
        int[] array = new int[50];

        
        int i = 0;
        while (i < array.length) {
            array[i] = i + 1;
            i++;
        }

        System.out.println("Even numbers and numbers divisible by 11:");
        i = 0;
        while (i < array.length) {
            int remainder = array[i] % 2;
            switch (remainder) {
                case 0:
                    System.out.print(array[i] + " ");
                    break;
                default:
                    remainder = array[i] % 11;
                    switch (remainder) {
                        case 0:
                            System.out.print(array[i] + " ");
                            break;
                    }
            }
            i++;
        }
    }
}