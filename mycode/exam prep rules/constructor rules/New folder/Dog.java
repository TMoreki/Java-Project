public class Dog extends Animal {
    private String breed;

    // Constructor calling parent's no-argument constructor
    public Dog() {
        // super(); is optional here, as it's implicitly added by the compiler if not present
        // Calls the no-argument constructor of Animal
        super();
        this.breed = "Unknown";
        System.out.println("Dog no-arg constructor called: breed = " + breed);
    }

    // Constructor calling parent's one-argument constructor
    public Dog(String name) {
        // Calls the one-argument constructor of Animal
        super(name);
        this.breed = "Unknown";
        System.out.println("Dog one-arg constructor called: name = " + name + ", breed = " + breed);
    }

    // Constructor calling parent's two-argument constructor
    public Dog(String name, int age, String breed) {
        // Calls the two-argument constructor of Animal
        super(name, age);
        this.breed = breed;
        System.out.println("Dog three-arg constructor called: breed = " + breed);
    }
}