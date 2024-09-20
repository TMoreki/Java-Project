interface Banana{
	void eatIt(){
		System.out.println("banana interface");

	}
}

public class Apple{
	public static void main (String[]args){
		Banana myBanana = new Banana{
			void eatIt(){
				System.out.println("eat your banana");
			}

		};


     myBanana.eatIt();
	}

}

