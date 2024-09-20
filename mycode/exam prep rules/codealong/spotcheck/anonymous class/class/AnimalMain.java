public class AnimalMain {
    public static void main(String[] args) {
        
        Animal animal = new Animal() {     

            // Rule 2: An anonymous class always overrides a method from the super-class.
            // It overrides the 'doSomething' method from the 'Animal' class.
            public void doSomething() {
                System.out.println("Doing something ...");
            }
        };                                 

        // Calling the method on the instance of the anonymous class
        animal.doSomething();              

        
        
    }
}