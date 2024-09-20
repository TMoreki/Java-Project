class GrandParent {
    int money = 100;
    public int getMoney(){
        return this.money;
    }
    // Constructor
    public GrandParent() {
        System.out.println("GrandParent constructor");
    }
    // Static initializer
    static {
        System.out.println("GrandParent static initializer");
    }
    // Instance initializer
    {
        System.out.println("GrandParent instance initializer");
    }
}

class Parent extends GrandParent {
    int money = 50;
    public int getMoney(){
        return this.money;
    }
    // Constructor
    public Parent() {
        System.out.println("Parent constructor");
    }
    // Static initializer
    static {
        System.out.println("Parent static initializer");
    }
    // Instance initializer
    {
        System.out.println("Parent instance initializer");
    }
}

class Child extends Parent {
  int money = 25;
    public int getMoney(){
        return this.money;
    } 
    // Constructor
    public Child() {
        System.out.println("Child constructor");
    }
    public Child(int a){
        this();
        int x = a;
        System.out.println(x);
    }
    // Static initializer
    static {
        System.out.println("Child static initializer");
    }
    // Instance initializer
    {
        System.out.println("Child instance initializer");
    }
}

public class TestChild2 {
    public static void main(String[] args) {
        Child child  = new Child();
        Parent parent = new Parent();
        GrandParent grandParent = new GrandParent();
        System.out.println("\ntesting this\n");
        //Child child2 = new Child();


        System.out.println(child.getMoney());// overiding 
        System.out.println(child.getMoney());
        System.out.println(child.getMoney());

    }
}