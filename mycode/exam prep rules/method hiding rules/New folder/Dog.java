public class Dog extends Animal {
    private String breed;  // Additional instance variable specific to Dog

    // No-argument constructor
    public Dog() {
        super();  // Calls the no-argument constructor of Animal
        this.breed = "Unknown";  // Sets a default breed
        System.out.println("Dog no-arg constructor called: breed = " + breed);  // Prints construction info
    }

    // One-argument constructor
    public Dog(String name) {
        super(name);  // Calls the one-argument constructor of Animal
        this.breed = "Unknown";  // Sets a default breed
        System.out.println("Dog one-arg constructor called: name = " + name + ", breed = " + breed);  // Prints construction info
    }

    // Three-argument constructor
    public Dog(String name, int age, String breed) {
        super(name, age);  // Calls the two-argument constructor of Animal
        this.breed = breed;  // Sets the breed
        System.out.println("Dog three-arg constructor called: breed = " + breed);  // Prints construction info
    }

    // Static method hiding Animal.makeSound()
    public static void makeSound() {
        System.out.println("Dog barks");  // Prints a dog-specific sound
    }

    // Static method hiding Animal.createAnimal()
    public static Dog createAnimal() {
        return new Dog("Buddy", 2, "Labrador");  // Creates and returns a new Dog instance
    }

    // Static method hiding Animal.checkHealth()
    public static void checkHealth() throws IllegalStateException {
        System.out.println("Checking dog health");  // Prints a dog-specific health check message
        // This method could potentially throw an IllegalStateException
    }
}