// Define the Main class containing the main method
public class Main {
    // The main method, entry point of the program
    public static void main(String[] args) {
        // Print the initial total number of animals
        Animal.printTotalAnimals();
        // Print the initial total number of dogs
        Dog.printTotalDogs();

        // Create a new Animal instance
        Animal genericAnimal = new Animal("Generic", 5);
        // Create a new Dog instance
        Dog dog1 = new Dog("Buddy", 3, "Labrador");
        // Create another Dog instance
        Dog dog2 = new Dog("Max", 2, "German Shepherd");

        // Print the updated total number of animals
        Animal.printTotalAnimals();
        // Print the updated total number of dogs
        Dog.printTotalDogs();
    }
}