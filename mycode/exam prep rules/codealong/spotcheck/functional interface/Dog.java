// Child class Dog
class Dog extends Animal implements AnimalSound {
    Dog(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
    
    @Override
    void eat() {
        System.out.println(name + " is eating dog food");
    }
}