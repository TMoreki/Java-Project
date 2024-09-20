class Animal {
    // Method 1
    protected void makeSound() {
        System.out.println("The animal makes a sound");
    }

    // Overloaded Method 2
    protected void makeSound(String sound) {
        System.out.println("The animal makes a " + sound);
    }
}

class Dog extends Animal {
    // Overloaded Method 1 in Dog class
    protected void makeSound(int times) {
        System.out.println("The dog barks " + times + " times");
    }

    // Overloaded Method 2 in Dog class
    protected void makeSound(String sound, int times) {
        System.out.println("The dog makes a " + sound + " " + times + " times");
    }

    // Overriding Method 1
    @Override
    protected void makeSound() {
        System.out.println("The dog barks");
    }

    // Overriding Method 2
    @Override
    protected void makeSound(String sound) {
        System.out.println("The dog makes a " + sound);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Calling methods by reference type
        animal.makeSound();  
        animal.makeSound("roar");  

        dog.makeSound();  // Calls Dog's overridden makeSound()
        dog.makeSound("bark loudly");  // Calls Dog's overridden makeSound(String)
        dog.makeSound(3);  // Calls Dog's overloaded makeSound(int)
        dog.makeSound("howl", 2);  // Calls Dog's overloaded makeSound(String, int)
    }
}
