//Abstract
// Declared with the 'abstract' keyword
// Can have abstract and non-abstract methods
// Cannot be instantiated directly
// Can have constructors and static methods
// Can have final methods
// Subclasses must implement all abstract methods
// 1. Abstract Class
abstract class Shape {
    abstract double area();
    
    void displayArea() {
        System.out.println("Area: " + area());
    }
}

class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}



// a) Static Nested Class
// Declared as static inside another class
// Can access only static members of the outer class
// Can be instantiated without an instance of the outer class
class OuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("This is a static nested class");
        }
    }
}

// b) Non-static Nested Class (Inner Class)
// Have access to all members of the outer class, including private members
// Must be instantiated with an instance of the outer class

class OuterClass2 {
    private int x = 10;
    
    class InnerClass {
        void display() {
            System.out.println("InnerClass: x = " + x);
        }
    }
}



// c) Local Class
// Defined inside a method or a scope block
// Have access to all members of the enclosing class
// Can only access local variables that are final or effectively final
class LocalClassExample {
    void method() {
        final int y = 20;
        
        class LocalClass {
            void display() {
                System.out.println("LocalClass: y = " + y);
            }
        }
        
        LocalClass local = new LocalClass();
        local.display();
    }
}


// d) Anonymous Class
// Declare and instantiate a class at the same time
// Used to make an instance of an object with certain "extras" such as overriding methods
// Have access to all members of the enclosing class
// Can only access local variables that are final or effectively final

interface Greeting {
    void greet();
}

class AnonymousClassExample {
    public static void main(String[] args) {
        Greeting anonymousGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class!");
            }
        };
        
        anonymousGreeting.greet();
    }
}



// Main class 
public class ClassExamples {
    public static void main(String[] args) {
        // Abstract class usage
        Shape circle = new Circle(5);
        circle.displayArea();
        
        // Static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();
        
        // Inner class
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.display();
        
        // Local class
        LocalClassExample localExample = new LocalClassExample();
        localExample.method();
        
        
    }
}