public class Constructor2 {

    public Constructor2() {
        this(""); // Call the constructor with an empty string
        System.out.println("Constructing with no-args constructor");
    }

    public Constructor2(String name) {
        System.out.println("Constructing Name:" + name);
    }
}