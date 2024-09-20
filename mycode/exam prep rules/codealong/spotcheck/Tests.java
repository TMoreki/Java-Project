public class Tests{

	static{
		System.out.println("Static initializer");
	}
	{
		System.out.println("Instace initializer")
	}
    
	public static void main(String[] args){
      Tests t  = new Tests();
	}
}

