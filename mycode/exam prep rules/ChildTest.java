// Define an interface named FamilyMember
interface FamilyMember {
    // Declare an abstract method named introduce
    void introduce();
}

// Define a class named Grandparent that implements FamilyMember interface
class Grandparent implements FamilyMember {
    // Static initializer block for Grandparent class
    static {
        System.out.println("Grandparent static initializer");
    }
    
    // Instance initializer block for Grandparent class
    {
        System.out.println("Grandparent instance initializer");
    }
    
    // Constructor for Grandparent class
    public Grandparent() {
        System.out.println("Grandparent constructor");
    }
    
    // Override the introduce method from FamilyMember interface
    
    public void introduce() {
        System.out.println("I am a Grandparent");
    }
}

// Define a class named Parent that extends Grandparent
class Parent extends Grandparent {
    // Static initializer block for Parent class
    static {
        System.out.println("Parent static initializer");
    }
    
    // Instance initializer block for Parent class
    {
        System.out.println("Parent instance initializer");
    }
    
    // Constructor for Parent class
    public Parent() {
        System.out.println("Parent constructor");
    }
    
    // Override the introduce method from Grandparent class
    
    public void introduce() {
        System.out.println("I am a Parent");
    }
}

// Define a class named Child that extends Parent
class Child extends Parent {
    // Static initializer block for Child class
    static {
        System.out.println("Child static initializer");
    }
    
    // Instance initializer block for Child class
    {
        System.out.println("Child instance initializer");
    }
    
    // Constructor for Child class
    public Child() {
        System.out.println("Child constructor");
    }
    
    // Override the introduce method from Parent class
    
    public void introduce() {
        System.out.println("I am a Child");
    }
}

// Define the main class named ChildTest
public class ChildTest {
    
    public static void main(String[] args) {
        // create Child object
        System.out.println("Creating a Child object:");
        // Create a new Child object
        Child child = new Child();
        
        // testing introduce methods
        System.out.println("\nTesting introduce methods:");
        // Create a Grandparent object and assign it to a FamilyMember reference
        FamilyMember grandparent = new Grandparent();
        // Create a Parent object and assign it to a FamilyMember reference
        FamilyMember parent = new Parent();
        // Assign the child object to a FamilyMember reference
        FamilyMember childAsMember = child;
        // Call introduce method on grandparent
        grandparent.introduce();
        // Call introduce method on parent
        parent.introduce();
        // Call introduce method on child (as FamilyMember)
        childAsMember.introduce();
        
        // testing inheritance
        System.out.println("\nTesting inheritance:");
        // Check if child is an instance of Grandparent and print the result
        System.out.println("Child is instance of Grandparent: " + (child instanceof Grandparent));
        // Check if child is an instance of Parent and print the result
        System.out.println("Child is instance of Parent: " + (child instanceof Parent));
        // Check if child is an instance of FamilyMember and print the result
        System.out.println("Child is instance of FamilyMember: " + (child instanceof FamilyMember));
    }
}