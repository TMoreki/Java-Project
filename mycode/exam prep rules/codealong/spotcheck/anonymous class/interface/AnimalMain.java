public class AnimalMain {
    public static void main(String[] args) {
        
        Animal animal = new Animal() {          // Anonymous class implementing the Animal interface

            
            
            public void doSomething() {
                System.out.println("Doing something ...");
            }
        };                                 

        
        animal.doSomething();              
    }
}
