public interface Printable{} // its public and will compile, not required to define any methods
//cant be private and protected


public  class Main {
    public static void main(String [] args) {

        Printable pr = new Printable(); // wont compile cannot be instantiated 
    }
}


public final interface Printable { // wont compile cant mark them as final same as abstract method

}



private final interface Printable { } // wont work marked with both private and final
//same as protected



//interface can extend multiple interfaces

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
    public default void Paste(); //default must provide a method body so wont work
    public int getPage(); // wont work method body without the use of default keyword

}


//code default with static and final
//cannot be static, require instance of the class implementing the interface
//they cant be final or abstract, they are allowed to be overriden in sublasses 






