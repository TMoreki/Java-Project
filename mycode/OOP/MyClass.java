public class MyClass {
    // Static instance initializer
    static {
        System.out.println("Static instance initializer");
    }

    // Instance initializer
    {
        System.out.println("Instance initializer");
    }

    // Instance variable
    private int value;

    // Constructor
    public MyClass(int value) {
        this.value = value;
        System.out.println("Constructor: value = " + value);
    }

    // Void method
    public void myMethod() {
        // Ordinary block within the method
        {
            int localVariable = 42;
            System.out.println("Ordinary block: localVariable = " + localVariable);
        }
        System.out.println("Method: value = " + value);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        obj.myMethod();
    }
}