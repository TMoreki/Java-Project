public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dogAsAnimal = new Dog();
        Dog dog = new Dog();
        
        System.out.println("Animal methods:");
        animal.makeSound();
        animal.makeSound("roar");
        animal.eat();
        animal.eat("grass");
        
        // System.out.println("\nDog methods through Animal reference:");
        // dogAsAnimal.makeSound();
        // dogAsAnimal.makeSound("howl");
        // dogAsAnimal.eat();
        // dogAsAnimal.eat("bone");
        
        // System.out.println("\nDog methods:");
        // dog.makeSound();
        // dog.makeSound("bark");
        // dog.makeSound(3);
        // dog.eat();
        // dog.eat("meat");
        // dog.eat("Bowls of Meat", 5);
    }
}