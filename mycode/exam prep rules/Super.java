//super constructor chaining using super keyword(part of inheritance)
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

// Derived class
class Dog extends Animal {
    String breed;

    // Constructor
    //First statement in constructor: The call to the superclass constructor using super() must be the first statement in the subclass constructor. If you don't explicitly call super(), the compiler will insert a call to the no-argument super constructor.
    //No mixing of super() and this(): A constructor can call either super() or this(), but not both.
    Dog(String name, String breed) {
        super(name); // Rule 1: Call to super must be first statement in constructor
        this.breed = breed;
        System.out.println("Dog constructor called");
    }
}


class Labrador extends Dog {
    String color;

    // Constructor with all parameters
    //Passing parameters: You can pass parameters to the superclass constructor using super(param1, param2, ...). This allows you to initialize the inherited members of the superclass.
    Labrador(String name, String breed, String color) {
        super(name, breed); // Rule 2: Passing parameters to immediate superclass constructor
        this.color = color;
        System.out.println("Labrador constructor called");
    }

    // Overloaded constructor
    //Constructors are not inherited: Subclasses do not inherit constructors from their superclass. They must define their own constructors
    Labrador(String name, String breed) {
        this(name, breed, "Yellow"); // Rule 3: Calling another constructor of the same class
    }
}

public class SuperConstructorChainExample {
    public static void main(String[] args) {
        System.out.println("Creating a Labrador:");
        Labrador lab = new Labrador("Buddy", "Labrador", "Chocolate");

        System.out.println("\nCreating another Labrador using overloaded constructor:");
        Labrador anotherLab = new Labrador("Max", "Labrador");
    }
}