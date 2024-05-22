public class Anonymous01Main {
    public static void main(String[] args) {
        final String name = "Mr Tseka"; // Make name final

        Anonymous01 superX = new Anonymous01() {
            public void doSomething() {
                System.out.println(name + ":Doing something ...");
            }
        };

        superX.doSomething();
    }
}