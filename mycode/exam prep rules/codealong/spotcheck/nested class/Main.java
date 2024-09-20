public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Using static nested class
        Animal.AnimalInfo.printInfo();

        // Using inner class
        Animal.AnimalBehavior behavior = dog.new AnimalBehavior();
        behavior.displayBehavior();

        // Using local class
        dog.demonstrateLocalClass();

        // Using anonymous class
        dog.demonstrateAnonymousClass();

        // Demonstrating method override
        dog.makeSound();
    }
}
