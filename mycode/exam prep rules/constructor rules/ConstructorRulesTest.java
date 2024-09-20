    class Animal{
	public String name;
	public int age;

	public  Animal(){
		this("unknows" , 0);
	}
	public Animal(String name){
		this(name, 0);
	}
	public Animal(String name,  int age){
		//then initialize instance variables
		this.name = name;
		this.age = age;
		System.out.println("Animal constructor: name =" + name + " , age =" + age);
	}
}

    class Dog extends Animal{
	public String breed;

	public Dog(){
		super();
		this.breed = "unknown";
		System.out.println("Dog constructor called: breed =" + breed);
	}
	public Dog(String name){
		super(name);
		this.breed = "unknown ";
		System.out.println("Animal constructor called: name = " + name + " , breed" + breed);
	}
	public Dog(String name, int age, String breed){
		super(name,age);
		this.breed = breed;
		System.out.println("Constructor 3 called : = breed " + breed);
	}
	
   
}

public class ConstructorRulesTest{
	public static void main(String[] args){
		System.out.println("\nCreating Animal instances\n");
		Animal animal1 = new Animal();
		Animal animal2 = new Animal("sibi");
		Animal animal3 = new Animal("max", 5);

		System.out.println("\nCreating Dog instances\n");
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("sibi");
		Dog dog3 = new Dog("max", 5,"Pitbull");
	}
}
