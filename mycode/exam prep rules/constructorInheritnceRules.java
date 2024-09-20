//constructorInheritnceRules
//first statement of every constructor is either a call to another constructor within the class using this(), or a call to a constructor in the direct parent class using super().
//if a parent constructor takes arguments the super constructor would also take arguments

class Shape {//class shape the first statement of the constructor is a call to the parent constructor which takes no arguments
	private int edge;
	public Car(int edge){
		Super();
		this.edge = edge;
	}
}

class Rectangle extends Shape{
	public Rectangle(int edge){
		super(edge);
	}
	public Rectangle(){
		this(4);
	}
}