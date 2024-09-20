class Grandparent{
	int money = 150;
	public int getGrandparentMoney(){
		return this.money;
	}
	public Grandparent(){
		System.out.println("Grandparent Constructor");
	}
	static{
		System.out.println("Grandparent static initializer");
	}
	{
		System.out.println("Grandparent instance initializer");
	}

}

class Parent extends Grandparent{
	int money = 100;
	public int getParentMoney(){
		return this.money;
	}
	public Parent(){
		System.out.println("Parent constructor");
	}
	static{
		System.out.println("Parent static initializer");
	}
	{
		System.out.println("Parent instance initializer");
	}

}

class Child extends Parent{
	int money = 100;
	public int getChildMoney{
		return this.money;
	}
	public Child(){
		System.out.println("Child Constructor");
	}
	static{
		System.out.println("Child static initializer");
	}
	{
		System.out.println("Child instance initializer");
	}

}

public class TestChild{
	public static void main(String[]args){
		Child child = new Child();
		System.out.println("\nSecond Run\n");
		Child child2 = new Child();
		System.out.println("\nThird Run\n");
		System.out.println(child.getGrandparentMoney());
		System.out.println(child.getParentMoney());
		System.out.println(child.getChildMoney());
	}
}