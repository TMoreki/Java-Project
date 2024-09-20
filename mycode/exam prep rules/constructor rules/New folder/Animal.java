public class Animal {
    private String name;
    private int age;

    // No-argument constructor
    public Animal() {
        // Calls the  constructor with default values
        this("Unknown", 0);
    }

    // Constructor with name
    public Animal(String name) {
        // Calls the  constructor with a default age
        this(name, 0);
    }

    // Constructor with name and age
    public Animal(String name, int age) {
        // Initialize instance variables
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor called: name = " + name + ", age = " + age);
    }
}