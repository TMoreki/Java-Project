public class InstCounterTest {
    public static void main(String[] args) {
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();

        System.out.println("InstanceCounter.getStaticCounter(): " + InstanceCounter.getStaticCounter());

        InstanceCounter.staticCounter = 1000;

        System.out.println("InstanceCounter.getStaticCounter(): " + InstanceCounter.getStaticCounter());

        obj1.incrementObjectCounter();
        InstanceCounter.incrementStaticCounter();
    }
}
