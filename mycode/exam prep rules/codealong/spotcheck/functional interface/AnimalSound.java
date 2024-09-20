// Rule 1: A functional interface must have exactly one abstract method
@FunctionalInterface
interface AnimalSound {
    void makeSound();
    
    // Rule 2: Default methods don't count towards the single abstract method rule
    default void breathe() {
        System.out.println("The animal is breathing");
    }
    
    // Rule 3: Static methods are allowed and don't count towards the single abstract method rule
    static void sleep() {
        System.out.println("The animal is sleeping");
    }
    
    // Rule 4: Methods from java.lang.Object don't count towards the single abstract method rule
    @Override
    boolean equals(Object obj);
}