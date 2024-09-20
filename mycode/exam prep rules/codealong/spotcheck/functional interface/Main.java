public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
        dog.eat();
        dog.breathe();
        AnimalSound.sleep();
        
        // Rule 5: Functional interfaces can be used with lambda expressions
        AnimalSound catSound = () -> System.out.println("Meow!");
        catSound.makeSound();
    }
}

