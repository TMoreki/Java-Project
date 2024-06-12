public class AssertTest2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;

        // Assertions
        assert a > 0 : "a must be greater than 0";
        assert b > 10 : "b must be greater than 10";

        System.out.println("Finished");
    }
}