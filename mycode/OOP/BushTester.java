public class BushTester {
    public static void main(String[] args) {
        GeorgeBushSnr bushSr = new GeorgeBushSnr();
        GeorgeBushJnr bushJr = new GeorgeBushJnr();

        System.out.println("Senior Bush:");
        System.out.println("Name: " + bushSr.getName());
        bushSr.printName();

        System.out.println("\nJunior Bush:");
        System.out.println("Name: " + bushJr.getName());
        bushJr.printName();
    }
}