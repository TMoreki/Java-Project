@FunctionalInterface
interface MyInterface {
    void myMethod();
}

public class Main {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyInterface obj = () -> System.out.println("MyInterface method called");
        
        // Calling the method
        obj.myMethod();
    }
}