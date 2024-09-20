public class Main {
    public static void main(String[] args) {
        // Create a new Dog instance
        Dog myDog = new Dog("Buddy");
        
        // Make the dog sound
        myDog.makeSound();
        
        // Create a custom animal using anonymous class
        Animal myCat = new Animal("Whiskers", () -> System.out.println("Meow!")) {};
        
        // Make the cat sound
        myCat.makeSound();
        
        // Create a custom animal using lambda expression
        Animal myBird = new Animal("Tweety", () -> System.out.println("Tweet!")) {};
        
        // Make the bird sound
        myBird.makeSound();
    }
}