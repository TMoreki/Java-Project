public class Animal {
    // Method 1
    protected void makeSound() {
        System.out.println("The animal makes a sound");
    }
    
    // Method 2
    protected void eat() {
        System.out.println("The animal eats");
    }
    
    // Overloaded Method 1
    protected void makeSound(String sound) {
        System.out.println("The animal makes a " + sound);
    }
    
    // Overloaded Method 2
    protected void eat(String food) {
        System.out.println("The animal eats " + food);
    }
}