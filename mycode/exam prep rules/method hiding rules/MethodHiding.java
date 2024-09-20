class Animal { 
  public static void print() { 
    System.out.println("Animal is printing"); 
  } 
} 

class Dog extends Animal { 
  public static void print() { 
    System.out.println("Dog is Printing"); 
  } 
}

public class MethodHiding {
  public static void main(String[] args) { 
    Animal.print();
    Dog.print();
  }
}

//Method hiding
//hiding static methods
//hiden method occurs when a child class defines a static method with the same name and signature as a static method from the parent class.
// rules for method hiding
//1 the method from the child class must have the same signature as the method from the parent class
//2 the method from the child class must be at least as accesible or more accessible than the method from the parent class.
//3 the method from the child class may not throw a checked exception that is new or broader than the class of any exception thrown from the parent class method.
//4 if the method returns a value it must  be the same  or a subclass  of the method from the parent class known as the covarient return types
//5 the method defined  in the child class must be marked as static if it is marked as static in the parent class(method hiding)
//6 the method must not be marked s static from the child class if it is not marked as static in the parent class(method overriding)
//the first four rules are the same rules for overring a method 