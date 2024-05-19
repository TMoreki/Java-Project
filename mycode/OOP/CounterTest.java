public class InstanceCounter {
    static int counter = 0; // Initialize counter to 0

    public InstanceCounter() {
        counter++; // Increment counter
        System.out.println("I am instance number: " + counter);
    }
}

