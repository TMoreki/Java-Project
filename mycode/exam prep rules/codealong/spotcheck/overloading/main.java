class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }

    public void makeSound(String sound) {
        System.out.println("The animal says: " + sound);
    }
}

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.makeSound();
        animal.makeSound("Woof");
    }
}