public class VoidMethTest {
    public static void main(String[] args) {
        testMeth(4);
    }

    static void testMeth(int param) {
        System.out.println("Step 1");
        if (param == 1) {
            System.out.println("param is 1");
        } else if (param == 2) {
            System.out.println("param is 2");
        } else if (param == 3) {
            System.out.println("param is 3");
        } else if (param == 4) {
            System.out.println("param is 4");
        } else if (param == 5) {
            System.out.println("param is 5");
        } else if (param == 6) {
            System.out.println("param is 6");
        } else {
            System.out.println("param is not in the range 1-6");
        }
    }
}