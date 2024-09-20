class Animal {
    public String makeSound() {
        return "Animal sound";
    }
    
    public double getWeight() {
        return 10.0; 
    }
}

class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof woof!";
    }
    
    @Override
    public double getWeight() {
        return super.getWeight() + 15.0; 
    }
    
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        
        System.out.println("Animal Sound: " + genericAnimal.makeSound());
        System.out.println("Animal Weight: " + genericAnimal.getWeight() + " kg");
        
        System.out.println("Dog Sound: " + dog.makeSound());
        System.out.println("Dog Weight: " + dog.getWeight() + " kg");
    }
}


// The method from child class must have the same signature as the method in the parent class.

// The method from child class must be at least as accessible or more accessible than the method in the parent class.

// The method from child class may not throw a checked exception that is new or broader than the class of any exception thrown from the parent class method.

// If the method returns a value, it must be the same or a subclass of the method in the parent class.