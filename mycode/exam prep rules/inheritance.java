//inheritance rules

// 1. multiple inharitance : A class can inherit from multiple classes
// a class Dog extends Animal


class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Duck extends Animal {
    void bark() {
        System.out.println("Duck quack");
    }
}


// 2. Multiple interface implementation: A class can implement multiple interfaces.
//the Duck class implements both Swimmable and Flyable interfaces

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck implements Swimmable, Flyable {
    public void swim() {
        System.out.println("Duck is swimming");
    }
    
    public void fly() {
        System.out.println("Duck is flying");
    }
}



// 3. 'extends' keyword: Used to declare inheritance from a superclass.
//keyword extends 

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}




// 4. 'implements' keyword: Used to implement interfaces.
// use of the keyword implements

class Duck implements Swimmable, Flyable {
    public void swim() {
        System.out.println("Duck is swimming");
    }



// 5. 'super' keyword: Refers to the superclass and can be used to call superclass members(variables and methods).

class Cat extends Animal {
    void eat() {
        super.eat(); // Calls the eat() method from Animal class
        System.out.println("Cat is eating fish");
    }
}
// 6. Method overriding: Subclasses can override methods from the superclass.
// the bird classoverrides the eat() method from Animal( do overriding rules here)(access modifies and return type)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird is eating seeds");
    }
}



// 7. 'final' keyword: Prevents a class from being inherited or a method from being overridden.
// it prevents FinalClass and finalMethod to prevent inheritance and overring

final class FinalClass {
    // This class cannot be inherited
}

// 8. Access modifiers: Inherited members' visibility depends on their access modifiers.
//

class Vehicle {
    public void start() { }
    protected void accelerate() { }
    void brake() { }  
    private void stop() { }
}

class Car extends Vehicle {
    void useVehicle() {
        start(); // Accessible (public)
        accelerate(); // Accessible (protected)
        brake(); // Accessible (default)
        // stop(); // Not accessible (private)
    }
}

// 9. Constructor chaining: Constructors are not inherited, but can be called using 'super()' and this()
// add an example of this. and constructors 
class Parent2 {
    Parent2(String message) {
        System.out.println(message);
    }
}

class Child extends Parent2 {
    Child() {
        super("Calling Parent constructor");
    }
}


//10. overloading 
//overloading occurs when multiple methods in the same class have the same name but different parameter lists
//class animal
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    
    // Overloaded methods
    void eat(String food) {
        System.out.println("Animal is eating " + food);
    }
    
    void eat(String food, int quantity) {
        System.out.println("Animal is eating " + quantity + " " + food);
    }
}

//class dog
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
    
    // Overloaded methods
    void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Dog is barking");
        }
    }
    
    void bark(String sound) {
        System.out.println("Dog says: " + sound);
    }
}
//class vehicle
class Vehicle {
    public void start() { 
        System.out.println("Vehicle is starting");
    }
    
    // Overloaded methods
    public void start(String key) {
        System.out.println("Vehicle is starting with " + key);
    }
    
    public void start(boolean remoteStart) {
        if (remoteStart) {
            System.out.println("Vehicle is starting remotely");
        } else {
            System.out.println("Vehicle is starting manually");
        }
    }
    
    protected void accelerate() { 
        System.out.println("Vehicle is accelerating");
    }
    
    // Overloaded method
    protected void accelerate(int speed) {
        System.out.println("Vehicle is accelerating to " + speed + " mph");
    }
    
    void brake() { 
        System.out.println("Vehicle is braking");
    }
    
    private void stop() { 
        System.out.println("Vehicle is stopping");
    }
}



//do initializers (static and instace)







