public class MethodHidingRules {
    public static void main(String[] args) {
        System.out.println("Demonstrating method hiding rules:");  // Prints the title

        // Rule 1 & 5: Same signature and static modifier
        System.out.println("\n1. Calling makeSound:");  // Prints section header
        Animal.makeSound();  // Calls Animal's static makeSound method
        Dog.makeSound();     // Calls Dog's static makeSound method (hidden method)

        // Rule 4: Covariant return types
        System.out.println("\n2. Demonstrating covariant return types:");  // Prints section header
        Animal genericAnimal = Animal.createAnimal();  // Creates an Animal using Animal's static method
        System.out.println("Created generic animal: " + genericAnimal.getClass().getSimpleName());  // Prints the type of animal created
        Dog dog = Dog.createAnimal();  // Creates a Dog using Dog's static method
        System.out.println("Created dog: " + dog.getClass().getSimpleName());  // Prints the type of animal created

        // Rule 3: Exception handling
        System.out.println("\n3. Demonstrating exception handling:");  // Prints section header
        try {
            Animal.checkHealth();  // Calls Animal's checkHealth method
            Dog.checkHealth();     // Calls Dog's checkHealth method
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName());  // Prints any caught exception
        }

        // Demonstrating static method behavior with instance reference
        System.out.println("\n4. Demonstrating static method behavior with instance reference:");  // Prints section header
        Animal dogAsAnimal = new Dog("Rex", 3, "German Shepherd");  // Creates a Dog object with an Animal reference
        dogAsAnimal.makeSound();  // Calls Animal's makeSound, not Dog's, because of static binding

        // Rule 2: Accessibility (implicitly demonstrated as both methods are public)
        System.out.println("\n5. Both Animal.makeSound() and Dog.makeSound() are public, demonstrating equal accessibility.");  // Prints note about accessibility
    }
}