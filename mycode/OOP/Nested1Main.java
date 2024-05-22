public class Nested1Main {
    public static void main(String[] args) {
        Nested1 outer = new Nested1(); // Create an instance of the outer class
        Nested1.Inner inner = outer.new Inner(); // Create an instance of the inner class using the outer instance
    }
}