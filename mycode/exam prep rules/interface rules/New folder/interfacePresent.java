// Define the Animal interface
interface Animal {
    // Abstract method that must be implemented by any class that implements this interface
    void makeSound();

    // Static method that belongs to the interface itself, not to implementing classes
    static void info() {
        System.out.println("This is an animal interface"); // Print information about the interface
    }

    // Default method that can be used as-is or overridden by implementing classes
    default void sleep() {
        System.out.println("The animal is sleeping"); // Default implementation for sleep behavior
    }
}

// Define a Dog class that implements the Animal interface
class Dog implements Animal {
    private String name; // Instance variable to store the dog's name

    // Constructor to initialize the dog's name
    public Dog(String name) {
        this.name = name; // Set the dog's name
    }

    // Implementation of the abstract makeSound method from the Animal interface
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!"); // Print the dog's sound
    }

    // Override the default sleep method from the Animal interface
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping soundly"); // Custom sleep behavior for dogs
    }
}

// Main class to demonstrate the usage of the Animal interface and Dog class
public class Main {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog("Buddy");

        // Call the implemented abstract method
        dog.makeSound(); // Will print: Buddy says: Woof!

        // Call the overridden default method
        dog.sleep(); // Will print: Buddy is sleeping soundly

        // Call the static method using the interface name
        Animal.info(); // Will print: This is an animal interface

        // Reference through the interface
        Animal animalDog = new Dog("Max"); // Polymorphism: Dog object referenced through Animal interface

        animalDog.makeSound(); // Will print: Max says: Woof!
        animalDog.sleep(); // Will print: Max is sleeping soundly
    }
}