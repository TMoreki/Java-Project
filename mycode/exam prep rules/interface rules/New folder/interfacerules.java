interface Print{//access is public and all its methods
	 //it got 3 methods public, abstract and default, static


	public abstact void setLength(String  hello);// you can pass parameters


	   

    public default int getPage (){ // the method can be inherited by the implimentation class, you can override the methods,
    	return 5;  //cannot be marked as final and abstract 
    
    }
     public static int setPage(){//implementation clas cannont inherit static interface methods, to call it you need to refference the interface name
        return 4;
    }
}

//now creating an implementing class

public class Book implements Print{
	//default first overridding it
	public int getPage(){
		return Print.super.getPage() +20;//we only refferincing the interface to override, the method is already inherited 
	}

    public static int setPage(){// it cannot be overriden, it only reffence straingt from the interface 
    	return 4;
    }

    public abstact void setLength(String  hello){// in order to override it  it must have a body
    	System.out.println(hello.length());
    	System.out.println(hello);
    }   

}

// main method create an instance 
public class Main{
	public static void main(String[] args){
      Book book = new Book();
      Book.setLengh();//start with abstract calling it 
      book.setLengh("hello");// pass the actual string value

      //create an instance of default by reffencing the interface name 
      Print print = new Book// we cant create an instance of an interface directlt, so we refferense
      System.out.println("page"+ print.getPage());

      //static,you call the method by refferencing the inteface name 
      System.out.println("setPage" Print.setPage());
        // safe it in separate clasees and compile 
	}
}

//functional interface can have ONLY one abstract method

