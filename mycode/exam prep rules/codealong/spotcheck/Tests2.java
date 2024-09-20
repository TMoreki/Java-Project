public class Tests2{

	int money = 150;
    public Tests2();
	static{
		System.out.println("Tests2 Static initializer");
	}
	{
		System.out.println("Tests2 Instace initializer")
	}


	public class Tests3{

	int money = 100;
    public Tests2(int );
	static{
		System.out.println("Tests3 Static initializer");
	}
	{
		System.out.println("Tests3 Instace initializer")
	}
	

    
	public static void main(String[] args){
      Tests3 t  = new Tests3();
	}
}