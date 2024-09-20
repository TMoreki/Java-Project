public class Banana{
	int a;
	int b;

	static int c;
	static int d;
	static int e;
	static int f;

	public Banana(){
		System.out.println("no args constructor");
	}
    public Banana( String name){
    	System.out.println( "one args constructor");
    }
    static{
    	e = 10;
        f = 10;

    	System.out.println("Static initializer");
    }

    {
    	System.out.println("instance initializer");
        a = 10;
    	b = 10;
        c  = 10;
        d = 10;
    }

    public static void main(String[] args){

    	Banana banana = new Banana("Green");
    	Banana banana2 = new Banana();


    }

    
}


