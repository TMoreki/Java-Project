public class GoingB3 {
    public static void main(String[] args) {
        int i = 0;
        do {
            switch (i) {
                case 0:
                    System.out.println(i);
                    break;
                case 1:
                    System.out.println(i + " greater than 0");
                    break;
                case 2:
                    System.out.println(i + " greater than 1");
                    break;
                case 3:
                    System.out.println(i + " greater than 2");
                    break;
                case 4:
                    System.out.println(i + " greater than 3");
                    break;
                case 5:
                    System.out.println(i + " greater than 4");
                    break;
                case 6:
                    System.out.println(i + " greater than 5");
                    break;
                case 7:
                    System.out.println(i + " greater than 6");
                    break;
                case 8:
                    System.out.println(i + " greater than 7");
                    break;
                case 9:
                    System.out.println(i + " greater than 8");
                    break;
                default:
                    System.out.println(i + " greater than 9");
                    break;
            }
            i++;
        } while (i <= 10);
    }
}