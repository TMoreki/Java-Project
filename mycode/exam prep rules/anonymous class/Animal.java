public abstract class Animal {
    // Declare an abstract method that must be implemented by subclasses
    public abstract void makeSound();
    
    // Define a non-abstract method that can be overridden by subclasses
    public void eat() {
        // Print a message indicating that the animal is eating
        System.out.println("The animal is eating.");
    }
}  