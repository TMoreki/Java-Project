@FunctionalInterface
interface MyInterface {
    // Abstract method (this is the functional method)
    void performAction(String input);

    // Static method
    static void printInfo() {
        System.out.println("Static method");
    }

    // Default method
    default void greet() {
        System.out.println("Default method");
    }
}

//implementing method
 class MyInterfaceImpl implements MyInterface {
    @Override
    public void performAction(String input) {
        System.out.println("Code along exercise: " + input);
    }

    public static void main(String[] args) {
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.performAction("For OCA");
        myInterface.greet();
        MyInterface.printInfo();
    }
}