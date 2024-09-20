// Animal.java
    interface Animal {
    // Abstract method
    void makeSound();

    // Static method
    static void describe() {
        System.out.println("This is an animal.");
    }

    // Default method
    default void move() {
        System.out.println("The animal is moving.");
    }
}

// Dog.java
    class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }

    // Optional: Override the default method
    @Override
    public void move() {
        System.out.println("The dog is running.");
    }
}

// Main.java
public class interface1 {
    public static void main(String[] args) {
        // Create a Dog instance
        Dog dog = new Dog();

        // Call the static method from the Animal interface
        Animal.describe();

        // Call the implemented abstract method
        dog.makeSound();

        // Call the default method
        dog.move();
    }
}