class Animal{
	public boolean hasTail(){
		return true;
	}
}

interface Sound{
	boolean canBark();
}

class Dog extends Animal implements Sound{
	public boolean canBark(){
		return true;
	}
	public int age = 5;
}

public class PolymorphismRules{
	public static void main(String[]args){

	}
}



