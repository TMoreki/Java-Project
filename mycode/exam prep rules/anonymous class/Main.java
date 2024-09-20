public class Main {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();
        
        // Call the makeSound method on the Dog instance
        myDog.makeSound();
        
        // Call the eat method inherited from Animal
        myDog.eat();
        
        // Call the method that demonstrates anonymous classes
        myDog.playWithAnonymous();
        
        // Rule 5: Demonstrate using an anonymous class to implement an interface
        Runnable myRunnable = new Runnable() {
            // Implement the run method required by the Runnable interface
            @Override
            public void run() {
                // Print a message from the anonymous Runnable
                System.out.println("Running in an anonymous class implementing Runnable");
            }
        };
        
        // Call the run method on the anonymous Runnable instance
        myRunnable.run();
    }
}