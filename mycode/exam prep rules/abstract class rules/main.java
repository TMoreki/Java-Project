public abstract class Animal {
    protected int age;
    
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
    
    public abstract String getSpecies();
}

public class Dog extends Animal {
    public String getSpecies() {
        return "PitBull";
    }
    
    // Additional method specific to Dog
    public void bark() {
        System.out.println("Woof woof!");
    }
    
    public static void main(String[] args) {
        // Cannot instantiate Animal because it's abstract
        // Animal animal = new Animal(); // This would cause a compilation error
        
        Dog dog = new Dog();
        dog.age = 5; // Accessing protected member from Animal
        
        System.out.println("Dog's species: " + dog.getSpecies());
        dog.makeSound(); // Using method inherited from Animal
        dog.bark(); // Using Dog-specific method
        
        // Demonstrating polymorphism
        Animal animalDog = new Dog();
        System.out.println("Animal dog's species: " + animalDog.getSpecies());
        animalDog.makeSound();
        // animalDog.bark(); // This would cause a compilation error
    }
}

//keyword abstract must be used
//it has no implementation in the class so you need to create an implementing class
//protected and public can be inherited
// abstract class not required to include any abstract method (but it can, just not required)
//abstract class method in an abstract class cannot have a body, but the other methods can have a body
//default method in abstract classes: you cant provide a default implementation,youcant define a method with abody, you cant mark it as abstract in an abstract class
//as long you do not mark it as final the subclass has the option to override it 
//an abstract class cannot be marked as final 
//an abstract class is one that must be extended by another class to be instantieted whereas a final class cant be extended by another class
//it cant be private because it wont be visible to the subclass 