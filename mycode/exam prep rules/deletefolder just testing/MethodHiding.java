class Animal{
	public static void print(){
		System.out.println("Printing Animal");
	}
}

class Dog extends Animal{
	public static void print(){
		System.out.println("Printing Dog");
	}
}

public class MethodHiding{
	public static void main(String[]args){
	Animal.print();
	Dog.print();
   }
 }  
