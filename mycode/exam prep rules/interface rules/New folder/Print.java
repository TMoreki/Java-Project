@FunctionalInterface
interface Print{//access is public and all its methods
	 //it got 3 methods public, abstract and default, static


	


	   

   public default int getPage (){ // the method can be inherited by the implimentation class, you can override the methods,
    	return 5;  //cannot be marked as final and abstract 
    
    }
   public static int setPage(){//implementation clas cannont inherit static interface methods, to call it you need to refference the interface name
        return 4;
      }

   public abstract void setLength(String  hello);// you can pass parameters
}