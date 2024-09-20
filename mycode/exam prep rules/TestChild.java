class GrandParent {
    int money = 100;
    public int getGrandParentMoney(){
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
    public int getParentMoney(){
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
    public int getChildMoney(){
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

public class TestChild {
    public static void main(String[] args) {
        Child child  = new Child();
        System.out.println("\ntesting this\n");
        //Child child2 = new Child();


        System.out.println(child.getGrandParentMoney());
        System.out.println(child.getParentMoney());
        System.out.println(child.getChildMoney());

    }
}

// //flow of excercusion it starts from the bottom then up
// //java starts from main first then checks the object order of inheritance is from bottom then up

//members of the class are variables and methods those are inherited, so they are up to bottom

// class GrandParent {
//     // Constructor
//     public GrandParent() {
//         System.out.println("GrandParent constructor");
//     }
//     // Static initializer
//     static {
//         System.out.println("GrandParent static initializer");
//     }
//     // Instance initializer
//     {
//         System.out.println("GrandParent instance initializer");
//     }
// }

// class Parent extends GrandParent {
//     // Constructor
//     public Parent() {
//         System.out.println("Parent constructor");
//     }
//     // Static initializer
//     static {
//         System.out.println("Parent static initializer");
//     }
//     // Instance initializer
//     {
//         System.out.println("Parent instance initializer");
//     }
// }

// class Child extends Parent {
//     // Constructor
//     public Child() {
//         System.out.println("Child constructor");
//     }
//     public Child(int a){
//         this();
//         int x = a;
//         System.out.println(x);
//     }
//     // Static initializer
//     static {
//         System.out.println("Child static initializer");
//     }
//     // Instance initializer
//     {
//         System.out.println("Child instance initializer");
//     }
// }

// public class TestChild {
//     public static void main(String[] args) {
//         Child child  = new Child();
//         System.out.println("\ntesting this\n");
//         //Child child2 = new Child();
//     }
// }