import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Base Animal class
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

// Dog class extending Animal
class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + breed;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Buddy", 3, "Labrador"));
        animals.add(new Dog("Max", 5, "German Shepherd"));
        animals.add(new Dog("Charlie", 2, "Beagle"));
        animals.add(new Animal("Whiskers", 4));

        // Example 1: Using a lambda function to filter animals older than 3 years
        System.out.println("Animals older than 3 years:");
        filterAndPrint(animals, animal -> animal.age > 3);

        // Example 2: Using a lambda function to filter dogs
        System.out.println("\nDogs:");
        filterAndPrint(animals, animal -> animal instanceof Dog);

        // Example 3: Using a predicate to filter Labradors
        Predicate<Animal> isLabrador = animal -> 
            animal instanceof Dog && ((Dog) animal).breed.equals("Labrador");
        System.out.println("\nLabradors:");
        filterAndPrint(animals, isLabrador);
    }

    // Method that uses a Predicate to filter and print animals
    public static void filterAndPrint(List<Animal> animals, Predicate<Animal> predicate) {
        for (Animal animal : animals) {
            if (predicate.test(animal)) {
                System.out.println(animal);
            }
        }
    }
}