public class Book implements Print{
	//default first overridding it
	public int getPage(){
		return Print.super.getPage() +20;//we only refferincing the interface to override, the method is already inherited 
	}

    public static int setPage(){// it cannot be overriden, it only reffence straingt from the interface 
    	return 4;
    }

    public void setLength(String hello){// in order to override it  it must have a body
    	System.out.println(hello.length());
    	System.out.println(hello);
    }   

}