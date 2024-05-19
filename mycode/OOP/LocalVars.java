public class LocalVars {
    public static void main(String[] args) {
        int localint = 0; // Initialize localint
        ValueHolder2 holder2 = new ValueHolder2(); // Create an instance of ValueHolder2

        System.out.println(localint); // Prints 0
        System.out.println(holder2.getValue()); // Prints the default value of ValueHolder2
    }
}