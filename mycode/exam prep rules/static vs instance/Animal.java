// Define the Animal class
public class Animal {
    // Static variable to keep track of total animals created
    public static int totalAnimals = 0;
    // Instance variable for the animal's name
    private String name;
    // Instance variable for the animal's age
    private int age;

    // Static method to print the total number of animals
    public static void printTotalAnimals() {
        // Print the total number of animals
        System.out.println("Total animals: " + totalAnimals);
    }

    // Constructor for creating a new Animal instance
    public Animal(String name, int age) {
        // Set the name of this animal instance
        this.name = name;
        // Set the age of this animal instance
        this.age = age;
        // Increment the total number of animals
        totalAnimals++;
    }
}