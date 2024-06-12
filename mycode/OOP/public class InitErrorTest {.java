public class InitErrorTest {
    static Object member;

    static {
        member = new Object();
    }

    public static void main(String[] args) {
        System.out.println("Step 1");
    }
}