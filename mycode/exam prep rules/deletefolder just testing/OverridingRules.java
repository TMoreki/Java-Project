class Animal{
	public String makeSound(){
		return "Animal sound";
	}
	public double getWeight(){
		return 10.0;
	}
}

class Dog extends Animal{
	@Override
	public String makeSound(){
		return"Woof woof!";
	}
	@Override
	public double getWeight(){
		return super.getWeight()+25.0;
	}
}

public class OverridingRules{
	public static void main(String[]args){
		Animal animal = new Animal();
		Dog dog = new Dog();

		System.out.println("Animal sound :" + animal.makeSound());
		System.out.println("Animal weight :" + animal.getWeight());

		System.out.println("Dog Sound :" + dog.makeSound());
		System.out.println("Dog Weight :" + dog.getWeight());
	}
}