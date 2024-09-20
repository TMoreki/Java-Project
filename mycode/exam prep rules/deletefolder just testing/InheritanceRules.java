class Grandparent{
	int money = 150;
	public int getGrandparentMoney(){
		return this.money;
	}
	public Grandparent(){
		System.out.println("Grandparent Constructor");
	}
	static{
		System.out.println("Grandparent Static");
	}
	{
		System.out.println("Grandparent instance");
	}
}

class Parent extends Grandparent{
	int money = 100;
	public int getParentMoney(){
		return this.money;
	}
	public Parent(){
		System.out.println("Parent Constructor");
	}
	static{
		System.out.println("Parent Static");
	}
	{
		System.out.println("Parent instance");
	}
}

class Child extends Parent{
	int money = 50;
	public int getChildMoney(){
		return this.money;
	}
	public Child(){
		System.out.println("Child Constructor");
	}
	static{
		System.out.println("Child Static");
	}
	{
		System.out.println("Child instance");
	}
}

public class InheritanceRules{
	public static void main(String[]args){
		Child child = new Child();
		System.out.println("\nSecond Run");
		Child child2 = new Child();
		System.out.println("\nThird run\n");
		System.out.println(child.getGrandparentMoney());
		System.out.println(child.getParentMoney());
		System.out.println(child.getChildMoney());
	}
}