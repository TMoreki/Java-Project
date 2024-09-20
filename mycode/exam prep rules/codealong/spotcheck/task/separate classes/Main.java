public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        // Calling methods by reference type
        animal.makeSound();  
        animal.makeSound("roar");  

        dog.makeSound();  // Calls Dog's overridden makeSound()
        dog.makeSound("bark loudly");  // Calls Dog's overridden makeSound(String)
    }
}