//constructors Rules

//the first statement of every constructor is eithr a call to another constructor within the class, using this(), or a call to a constuctor in the direct parent class using super().
//if a parent constructor takes arguments the super constructor would also take arguments.
//super() command ,ay only be used as the first statement of the constructor 
//can only be used as the first statement not anywhere else after the constructor
//if the parent has more than one constructor say two constructors the child may use any valid parent constructor in its definition.
//compiler automatically insert a call to the no argument constructutor super() if the first statemnt is not a call to the parent constructor
//what happens when the parent class does not have a no argument constructor? java will create one for you and you must create one constructor in your child class that explicitly call a parent constructor via the the super() command
//parent constructor ia always executed before the child constructor.



//calling inherited class members
//java classes may use public or protected member from the parent class including methods, primitives or object references 
//if the prent class and child class are from thr same package the child class can use any default member defined in the parent class
//finally a child class cannot access the private member from the parent class directly, we can access private memebers from parent only via a public or protected method
//you can use this to access member of the parent class that are accessible from the child class
//in java you can explicitly referrence a member of the parent class by using the super keyword


//Method hiding
//hiding static methods
//hiden method occurs when a child class defines a static method with the same name and signature as a static method from the parent class.
//five rules for method hiding
//1 the method from the child class must have the same signature as the method from the parent class
//2 the method from the child class must be at least as accesible or more accessible than the method from the parent class.
//3 the method from the child class may not throw a checked exception that is new or broader than the class of any exception thrown from the parent class method.
//4 if the method returns a value it must  be the same  or a subclass  of the method from the parent class known as the covarient return types
//5 the method defined  in the child class must be marked as static if it is marked as static in the parent class(method hiding)
//6 the method must not be marked s static from the child class if it is not marked as static in the parent class(method overriding)
//the first four rules are the same rules for overring a method 


//overring vs Hiding methods.
//with overring a method a child method replaces the parent method in the calls defined in both the parent and the and the child
//hidden methods only replace parent methods in the calls defined in the child class
//the child version of an overriden method is executed for an instance regardless of whether the method call is defined  in a parent or child class method
//the parent method is never used unless an explicit call to the parent method is referenced using the syntax ParentClassName.method().
//at runtime the parent version of a hidden method is always executed if the call to the method is defined in the parent class.


//final method
//final methods cannot be overriden
//this rule is in place when you override a method and when you hide a method
//you cannot hide a static method ina parent class if its marked as final


//inheriting variables
//java does not allow variables to be overriden but instead hidden
//to hide a variable you can define a variable with the same name as a variable in a parent class.
//as when hiding a static method you cant override a variable and you can only hide it.
//if you referencing the variable from within a child class the variable defined in the child class is used
//you can reference the parent value of the variable with an eplicit use of the super keyword



//polymorphism
//the property of an object to take on many different forms
//a java object may be accessed using a reference with the same type as the object
//the referrence can be a superclass of the object or a reference that defines an interface the object implements either directly or through a superclass
//a cast is not required if the object is being reassigned to a super type or interface of the object
//casting an object from a subclass to a superclass doesnt require an explicit cast
//vasting an object from a superclass to a subclass reqires an explicit cast
//we cannot cast to unrelated types
//when two classes share a related heirachy that doesnt mean an instance of one can automatically be cast to another
//virtual methods
//a virtual method is a method in which the specific implementation is not determined until runtime.
//all non final, non static and non private java methods are considered virtual methods since any of the can be overriden at runtime
//if you call a meyhod on an object that overides a method you get the overiden method even if the call to the method is on a parent reference or within the parent class.
//polymorphic Parameters
//with polymorphisym we can pass instances of a subclass  or interface to a method
//eg you can define a method that takes an instance of interface as a parameter.in this maner any classs that implements theinterface can be passes to the method







