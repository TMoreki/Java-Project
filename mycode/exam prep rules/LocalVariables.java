//Local Variables rules

public class LocalVariableRules {

    public static void main(String[] args) {
        // Rule 1: Local variables must be declared before use
        int x = 10;
        System.out.println("x: " + x);

        // Rule 2: Local variables are only accessible within their scope
        {
            int y = 20;
            System.out.println("y: " + y);
        }
        // System.out.println(y); // This would cause a compilation error

        // Rule 3: Local variables are not initialized by default
        int z;
        // System.out.println(z); // This would cause a compilation error
        z = 30;
        System.out.println("z: " + z);

        // Rule 4: Local variables can't have the same name as parameters or other local variables in the same scope
        int a = 40;
        // int a = 50; // This would cause a compilation error

        // Rule 5: Local variables can't use access modifiers
        // private int b = 60; // This would cause a compilation error

        // Rule 6: Local variables can be marked as final
        final int CONSTANT = 70;
        // CONSTANT = 80; // This would cause a compilation error

       

        // Rule 7: Local variables can't be static
        // static int c = 90; // This would cause a compilation error

        exampleMethod(100);
    }

    public static void exampleMethod(int param) {
        // Rule 8: Method parameters are treated as local variables
        System.out.println("param: " + param);

        // Rule 9: Local variables can shadow class members
        int x = 110; // This x is different from the x in main
        System.out.println("Local x: " + x);
    }
}