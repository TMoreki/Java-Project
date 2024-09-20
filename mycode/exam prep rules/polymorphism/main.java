class Animal {
    // Method to check if the animal has a tail
    public boolean hasTail() {
        return true; // assume all animals have tails
    }
}

// Define an interface for objects that can make sounds
interface Soundable {
    // Abstract method to check if the animal can bark
    boolean canBark();
}


class Dog extends Animal implements Soundable {
    // Implement the canBark method from Soundable interface
    public boolean canBark() {
        return true; // Dogs can bark
    }
    
    // Instance variable for the dog's age
    public int age = 5; // Initialize age to 5
    
    // Main method to demonstrate polymorphism
    public static void main(String[] args) {
        // Create a new Dog object
        Dog dog = new Dog();
        // Print the dog's age
        System.out.println("Dog's age: " + dog.age);
        // Treat the dog as a Soundable object
        Soundable soundable = dog;
        // Call canBark() method through Soundable reference
        System.out.println("Can the dog bark? " + soundable.canBark());
        // Treat the dog as an Animal object
        Animal animal = dog;
        // Call hasTail() method through Animal reference
        System.out.println("Does the animal have a tail? " + animal.hasTail());
    }
}

//polymorphism
//the property of an object to take on many different forms
//a java object may be accessed using a reference with the same type as the object
//the referrence can be a superclass of the object or a reference that defines an interface the object implements either directly or through a superclass
//a cast is not required if the object is being reassigned to a super type or interface of the object
//casting an object from a subclass to a superclass doesnt require an explicit cast
//vasting an object from a superclass to a subclass reqires an explicit cast
//we cannot cast to unrelated types
//when two classes share a related heirachy that doesnt mean an instance of one can automatically be cast to another
//virtual methods
//a virtual method is a method in which the specific implementation is not determined until runtime.
//all non final, non static and non private java methods are considered virtual methods since any of the can be overriden at runtime
//if you call a meyhod on an object that overides a method you get the overiden method even if the call to the method is on a parent reference or within the parent class.
//polymorphic Parameters
//with polymorphisym we can pass instances of a subclass  or interface to a method
//eg you can define a method that takes an instance of interface as a parameter.in this maner any classs that implements theinterface can be passes to the method