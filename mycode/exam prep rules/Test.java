// Interface1.java
interface Interface1 {
    // Abstract method
    void abstractMethod1();
    
    // Default method
    default void defaultMethod1() {
        System.out.println("Default method in Interface1");
    }
    
    // Static methods
    static void staticMethod1() {
        System.out.println("Static method 1 in Interface1");
    }
    
    static void staticMethod2() {
        System.out.println("Static method 2 in Interface1");
    }
    
    static void staticMethod3() {
        System.out.println("Static method 3 in Interface1");
    }
}

// Interface2.java
interface Interface2 {
    // Abstract methods
    void abstractMethod2();
    void abstractMethod3();
    
    // Default method
    default void defaultMethod2() {
        System.out.println("Default method in Interface2");
    }
    
    // Static methods
    static void staticMethod4() {
        System.out.println("Static method 4 in Interface2");
    }
    
    static void staticMethod5() {
        System.out.println("Static method 5 in Interface2");
    }
    
    static void staticMethod6() {
        System.out.println("Static method 6 in Interface2");
    }
}

// Test.java
public class Test implements Interface2 {
    
    public void abstractMethod2() {
        System.out.println("Implementation of abstractMethod2");
    }
    
    
    public void abstractMethod3() {
        System.out.println("Implementation of abstractMethod3");
    }

    public static void main(String[] args) {
        Test test = new Test();
        
        // Call implemented methods
        test.abstractMethod2();
        test.abstractMethod3();
        
        // Call default method from Interface2
        test.defaultMethod2();
        
        // Call static methods from Interface2
        Interface2.staticMethod4();
        Interface2.staticMethod5();
        Interface2.staticMethod6();
        
        // Call static methods from Interface1 (even though Test doesn't implement Interface1)
        Interface1.staticMethod1();
        Interface1.staticMethod2();
        Interface1.staticMethod3();
    }
}