public class Dog extends Animal {
    // Overloaded Method 1 in Dog class
    protected void makeSound(int times) {
        System.out.println("The dog barks " + times + " times");
    }
    
    // Overloaded Method 2 in Dog class
    protected void eat(String food, int amount) {
        System.out.println("The dog eats " + amount + " " + food);
    }
    
    // Overriding Method 1
    @Override
    protected void makeSound() {
        System.out.println("The dog barks");
    }
    
    // Overriding Method 2
    @Override
    protected void eat() {
        System.out.println("The dog eat dog food");
    }
    
    // Overriding Overloaded Method 1
    @Override
    protected void makeSound(String sound) {
        System.out.println("The dog " + sound + "s");
    }
    
    // Overriding Overloaded Method 2
    @Override
    protected void eat(String food) {
        System.out.println("The dog eats " + food + " quickly");
    }
}