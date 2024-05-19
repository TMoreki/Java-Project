public class InstanceCounter {
    public static int staticCounter;
    public int objectCounter;

    public InstanceCounter() {
        staticCounter++;
        System.out.println("new object created: " + staticCounter);
    }

    public static void incrementStaticCounter() {
        staticCounter++;
        System.out.println("Number of instances in static: " + staticCounter);
    }

    public void incrementObjectCounter() {
        objectCounter++;
        System.out.println("Counter in instance: " + objectCounter);
    }

    public int getObjectCounter() {
        return objectCounter;
    }

    public static int getStaticCounter() {
        return staticCounter;
    }
}