abstract class SuperX {
    abstract void doSomething();
}

public class SuperXMain {
    public static void main(String[] args) {
        SuperX superX = new SuperX() {
            @Override
            void doSomething() {
                System.out.println("Doing something ...");
            }
        };

        superX.doSomething();
    }
}
