// File: Animal.java
public class Animal {
    // Rule: Static variables are shared among all instances of a class
    public static int totalAnimals = 0;

    // Rule: Instance variables are unique to each instance
    private String name;
    private int age;

    // Rule: Static methods can be called on the class itself
    public static void printTotalAnimals() {
        System.out.println("Total animals: " + totalAnimals);
    }

    // Rule: Constructors are called when creating a new instance
    public Animal(String name, int age) {
        // Rule: 'this' refers to the current instance
        this.name = name;
        this.age = age;
        totalAnimals++;  // Rule: Static variables can be modified
    }

    // Rule: Instance methods operate on the specific instance's data
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

// File: Dog.java
// Rule: Inheritance - Dog extends Animal
public class Dog extends Animal {
    // Rule: Subclasses can have their own static variables
    public static int totalDogs = 0;

    // Rule: Subclasses can have additional instance variables
    private String breed;

    // Rule: Subclasses can have their own static methods
    public static void printTotalDogs() {
        System.out.println("Total dogs: " + totalDogs);
    }

    // Rule: Subclass constructors can call superclass constructors
    public Dog(String name, int age, String breed) {
        super(name, age);  // Rule: 'super' calls the superclass constructor
        this.breed = breed;
        totalDogs++;
    }

    // Rule: Method overriding - subclass can override superclass methods
    @Override
    public void introduce() {
        super.introduce();  // Rule: Can call superclass method in overridden method
        System.out.println("I'm a " + breed + " dog.");
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Rule: Static methods can be called without creating an instance
        Animal.printTotalAnimals();
        Dog.printTotalDogs();

        // Rule: Objects are created using the 'new' keyword and a constructor
        Animal genericAnimal = new Animal("Generic", 5);
        Dog dog1 = new Dog("Buddy", 3, "Labrador");
        Dog dog2 = new Dog("Max", 2, "German Shepherd");

        // Rule: Static methods reflect changes across all instances
        Animal.printTotalAnimals();
        Dog.printTotalDogs();

        // Rule: Instance methods are called on specific objects
        genericAnimal.introduce();
        dog1.introduce();
        dog2.introduce();
    }
}