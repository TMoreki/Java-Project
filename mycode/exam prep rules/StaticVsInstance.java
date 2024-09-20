// Static members are declared using the static keyword.
// Instance members are declared without the static keyword.

public class StaticVsInstance {
    // Static variable
    // Static members are allocated memory once per class.
    public static int staticVar = 0;
    
    // Instance variable
    // Instance members are allocated memory for each object of the class.
    public int instanceVar = 0;






// Accessing members
// Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static variable: " + staticVar);
        // System.out.println(instanceVar); // This would cause a compilation error
        // instanceMethod(); // This would cause a compilation error
    }
    
    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        staticMethod(); // This is allowed
    }


// Static members can be accessed using the class name (e.g., StaticVsInstanceExample.staticVar).
// Instance members require an object of the class to be accessed (e.g., obj1.instanceVar).


// Method access:

// Static methods can only directly access other static members.
// Instance methods can access both static and instance members.

 public static void main(String[] args) {
        // Accessing static members
        System.out.println(StaticVsInstanceExample.staticVar);
        StaticVsInstanceExample.staticMethod();
        
        // Creating instances
        StaticVsInstanceExample obj1 = new StaticVsInstanceExample();
        StaticVsInstanceExample obj2 = new StaticVsInstanceExample();
        
        // Modifying static variable
        StaticVsInstanceExample.staticVar = 1;
        System.out.println("obj1 static var: " + obj1.staticVar);
        System.out.println("obj2 static var: " + obj2.staticVar);
        
        // Modifying instance variables
        obj1.instanceVar = 1;
        obj2.instanceVar = 2;
        System.out.println("obj1 instance var: " + obj1.instanceVar);
        System.out.println("obj2 instance var: " + obj2.instanceVar);
        
        // Calling instance method
        obj1.instanceMethod();
    }
}
// 'this' keyword:
// 'this' cannot be used in static context.
// 'this' can be used in instance methods to refer to the current object.


// Overriding:
// Static methods cannot be overridden (they can be hidden in subclasses).
// Instance methods can be overridden in subclasses.


// Initialization:
// Static variables are initialized when the class is loaded.
// Instance variables are initialized when an object is created.



// Usage scenarios:
// Use static for members that are shared across all instances of a class.
// Use instance for members that are unique to each object of the class.



