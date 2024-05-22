public class Main {
    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outer = new OuterClass();

        // Create an instance of the inner class using the outer instance
        OuterClass.InnerClass inner = outer.new InnerClass();
    }
}