// Abstract class representing an animal
public abstract class Animal {
    // Protected fields accessible by subclasses
    protected String name;
    protected AnimalSoundMaker soundMaker;

    // Constructor to initialize name and sound maker
    public Animal(String name, AnimalSoundMaker soundMaker) {
        this.name = name;
        this.soundMaker = soundMaker;
    }

    // Method to make the animal sound
    public void makeSound() {
        System.out.print(name + " says: ");
        // Call the makeSound method of the AnimalSoundMaker interface
        soundMaker.makeSound();
    }
}