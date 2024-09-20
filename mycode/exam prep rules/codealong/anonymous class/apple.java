interface Banana{
	void eatIt();		
}

public class Apple{
	public static void main (String[]args){
		Banana myBanana = new Banana(){
			public void eatIt(){
				System.out.println("eat your banana");
			}

		};


     myBanana.eatIt();
	}

}

