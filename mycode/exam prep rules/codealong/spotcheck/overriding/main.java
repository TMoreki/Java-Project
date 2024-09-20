class Animal {
    private void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class main {
    public static void main(String[] args) {
         Animal animal = new Animal();
         Animal dog = new Dog();

         animal.makeSound();  
         dog.makeSound();    
    }
}