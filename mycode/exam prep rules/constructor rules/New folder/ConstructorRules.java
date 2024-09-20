public class ConstructorRules {
    public static void main(String[] args) {
        System.out.println("Creating Animal instances:");
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Fluffy");
        Animal animal3 = new Animal("Whiskers", 5);

        System.out.println("\nCreating Dog instances:");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Buddy");
        Dog dog3 = new Dog("Max", 3, "PitBull");
    }
}


//constructors Rules

//the first statement of every constructor is eithr a call to another constructor within the class, using this(), or a call to a constuctor in the direct parent class using super().
//if a parent constructor takes arguments the super constructor would also take arguments.
//super() command ,ay only be used as the first statement of the constructor 
//can only be used as the first statement not anywhere else after the constructor
//if the parent has more than one constructor say two constructors the child may use any valid parent constructor in its definition.
//compiler automatically insert a call to the no argument constructutor super() if the first statemnt is not a call to the parent constructor
//what happens when the parent class does not have a no argument constructor? java will create one for you and you must create one constructor in your child class that explicitly call a parent constructor via the the super() command
//parent constructor ia always executed before the child constructor.