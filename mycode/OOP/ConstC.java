public class ConstC extends ConstB {
    public ConstC(String name) {
        super(name, "Smith");
        System.out.println("Class C: " + name);
    }

    public ConstC() {
        this("Peter"); // Call the name-arg constructor with "Peter"
        System.out.println("Class C: No-args constructor");
    }
}