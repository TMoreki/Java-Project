// Define the Dog class, which extends (inherits from) Animal
public class Dog extends Animal {
    // Static variable to keep track of total dogs created
    public static int totalDogs = 0;
    // Instance variable for the dog's breed
    private String breed;

    // Static method to print the total number of dogs
    public static void printTotalDogs() {
        // Print the total number of dogs
        System.out.println("Total dogs: " + totalDogs);
    }

    // Constructor for creating a new Dog instance
    public Dog(String name, int age, String breed) {
        // Call the superclass (Animal) constructor
        super(name, age);
        // Set the breed of this dog instance
        this.breed = breed;
        // Increment the total number of dogs
        totalDogs++;
    }
}