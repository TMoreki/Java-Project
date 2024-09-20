// Concrete class representing a dog, extending the Animal class
public class Dog extends Animal {
    // Constructor for Dog
    public Dog(String name) {
        // Call the superclass constructor with name and a lambda expression for the sound
        super(name, () -> System.out.println("Woof!"));
    }
}