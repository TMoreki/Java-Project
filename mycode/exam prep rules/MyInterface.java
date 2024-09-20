public interface Printable{} // its public and will compile, not required to define any methods
//goal is to have methods implementing them
//cant be private and protected


public  class Main {
    public static void main(String [] args) {

        Printable pr = new Printable(); //R1 wont compile cannot be instantiated 
    }
}

                                //R2 if final methods cant be overriden and defies the purpose of an interface to implement the method
public final interface Printable { // wont compile cant mark them as final same as abstract method

}


                                      //R3 it cant be private and protected
private final interface Printable { } //  wont work marked with both private and final
protected interface Printable{} 




                                      //R4 interface can extend multiple interfaces

public interface PrintableA{
    public int getLength();
}

public interface PrintableB{
    public int getLengthNumber();
}

public interface PrintableC extends PrintableA, PrintableB{

}



//class can implement an interface but a class cannot extend an interface,wont compile

public class PrintableB{
    public class PaperA extends PrintableB {}//cannot extend an interface
}


//interface can extend another interface but an interface cannot implement another interface

public class PaperB{} // a class trying to extend an interface

public interface PrintableA extends PaperB{} // interface trying to extend a class



//Abstract method with multiple inheritance(two interfaces that contain same abstract method)

public interface Printable{
    public void format();
}

public interface Formattable{ //both interface methods format() have same signature so both do interface at the same time
    public void format();
    public void Paste();
}









//interface can be default(default keyword used)

public interface Printable{
    default void Paste(); //default must provide a method body so wont work
    public int getPage(); // wont work method body without the use of default keyword
    //have a class that implements this interface

}





public interface Printable {
    default void paste() {
        System.out.println("Default paste method");
    }
    
    int getPage();
}

class Document implements Printable {
    private int currentPage;
    
    public Document(int startPage) {
        this.currentPage = startPage;
    }
    
    @Override
    public int getPage() {
        return currentPage;
    }
    
    // Optional: Override the default paste method
    @Override
    public void paste() {
        System.out.println("Pasting content into the document");
    }
}

public class Main {
    public static void main(String[] args) {
        Document doc = new Document(1);
        System.out.println("Current page: " + doc.getPage());
        doc.paste();
    }
}


//cannot be static, require instance of the class implementing the interface
//they cant be final or abstract, they are allowed to be overriden in sublasses 




//Static interface Methods
//They are not inherited in any classes that implements the interface(always assume they are public else they wont work)

public interface Printable {
    static int getLength(){ // static method defined in a class
        return 1;
    }
}

public  class Paper implements Printable {
    public void printDetails() {
        System.out.println(getLength()); // wont compile becaue of static 
    }
}



// Default methods and multiple inheritance
//if a class implements two interfaces that have default methods with the same name and signature it will throw an error


interface Walk {
    public default int getSpeed(){
        Return 5;
    }
}

interface Run {
    public default int getSpeed() {
        Return 10;
    }
}

class Tlotlegi implements Walk, Run{
    public static void main(String[] args){
        System.out.println(new Tlotlegi().getSpeed());
    }
}

//To solve the above subclass overrides the duplicate default methods and it will compile

public class Tlotlegi implements Walk, Run {
    public int getSpeed(){
        return 1;
    
}

public static void main(String[] args)
  System.out.println(new Tlotlegi().getSpeed());
    }
}





// Define an interface named Printable
interface Printable {
    // Define a default method named paste
    default void paste() {
        // Print a default message for the paste method
        System.out.println("Default paste method");
    }
    
    // Declare an abstract method getPage that returns an int
    int getPage();
}

// Define a class named Document that implements the Printable interface
class Document implements Printable {
    // Declare a private instance variable to store the current page
    private int currentPage;
    
    // Constructor for the Document class
    public Document(int startPage) {
        // Initialize the currentPage with the provided startPage
        this.currentPage = startPage;
    }
    
    // Implement the getPage method from the Printable interface
    public int getPage() {
        // Return the value of currentPage
        return currentPage;
    }
    
    // Override the default paste method
    public void paste() {
        // Print
        System.out.println("Pasting content into the document");
    }
}


public class Main {
    
    public static void main(String[] args) {
        // Create a new Document object with an initial page of 1
        Document doc = new Document(1);
        // Print the current page of the document
        System.out.println("Current page: " + doc.getPage());
        // Call the paste method on the document object
        doc.paste();
    }
}



//This one implements

// GrandParent.java
public class GrandParent {
    protected String grandParentName;

    // Static initializer
    static {
        System.out.println("GrandParent static initializer");
    }

    // Instance initializer
    {
        System.out.println("GrandParent instance initializer");
    }

    // Constructor
    public GrandParent(String name) {
        this.grandParentName = name;
        System.out.println("GrandParent constructor");
    }

    public void grandParentMethod() {
        System.out.println("This is a method from GrandParent");
    }
}

// Parent.java
public class Parent extends GrandParent {
    protected String parentName;

    // Static initializer
    static {
        System.out.println("Parent static initializer");
    }

    // Instance initializer
    {
        System.out.println("Parent instance initializer");
    }

    // Constructor
    public Parent(String grandParentName, String parentName) {
        super(grandParentName);
        this.parentName = parentName;
        System.out.println("Parent constructor");
    }

    public void parentMethod() {
        System.out.println("This is a method from Parent");
    }
}

// Child.java
public class Child extends Parent {
    private String childName;

    // Static initializer
    static {
        System.out.println("Child static initializer");
    }

    // Instance initializer
    {
        System.out.println("Child instance initializer");
    }

    // Constructor
    public Child(String grandParentName, String parentName, String childName) {
        super(grandParentName, parentName);
        this.childName = childName;
        System.out.println("Child constructor");
    }

    public void childMethod() {
        System.out.println("This is a method from Child");
    }

    public void displayNames() {
        System.out.println("GrandParent: " + grandParentName);
        System.out.println("Parent: " + parentName);
        System.out.println("Child: " + childName);
    }
}

// TestChild.java
public class TestChild {
    public static void main(String[] args) {
        Child child = new Child("Grandpa", "Dad", "Son");
        
        System.out.println("\nCalling methods:");
        child.grandParentMethod();
        child.parentMethod();
        child.childMethod();
        
        System.out.println("\nDisplaying names:");
        child.displayNames();
    }
}