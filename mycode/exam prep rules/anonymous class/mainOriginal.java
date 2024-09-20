// Abstract class Animal
abstract class Animal {
    // Abstract method that must be implemented by subclasses
    public abstract void makeSound();

    // Non-abstract method that can be overridden
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

// Concrete class Dog that extends Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }

    // Method to demonstrate anonymous class creation
    public void playWithAnonymous() {
        // Anonymous class extending Animal
        Animal anonymousAnimal = new Animal() {
            // Rule 1: Must implement all abstract methods of the superclass
            @Override
            public void makeSound() {
                System.out.println("The anonymous animal makes a sound: Meow!");
            }

            // Rule 2: Can override non-abstract methods of the superclass
            @Override
            public void eat() {
                System.out.println("The anonymous animal is eating quietly.");
            }

            // Rule 3: Can define its own methods, but they can't be called directly
            public void hideAndSeek() {
                System.out.println("The anonymous animal is playing hide and seek.");
            }
        };

        // Using the anonymous class
        anonymousAnimal.makeSound();
        anonymousAnimal.eat();
        // anonymousAnimal.hideAndSeek(); // This would cause a compilation error

        // Rule 4: Can access final or effectively final local variables
        final String location = "park";
        Animal playfulAnimal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("The playful animal is making sounds in the " + location);
            }
        };
        playfulAnimal.makeSound();
    }
}

// Main class to demonstrate usage
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.eat();
        myDog.playWithAnonymous();

        // Rule 5: Can be used to implement interfaces
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in an anonymous class implementing Runnable");
            }
        };
        myRunnable.run();
    }
}
