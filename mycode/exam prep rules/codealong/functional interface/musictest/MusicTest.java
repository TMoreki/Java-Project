// Functional interface for Musician
@FunctionalInterface
interface Musician {
    // Abstract method (the single abstract method for the functional interface)
    String perform();

    // Default method
    default String getName() {
        return "Unknown Artist";
    }

    // Another default method
    default String getSong() {
        return "Untitled";
    }

    // Static method
    static void announcePerformance(Musician musician) {
        System.out.println("Now performing: " + musician.getName() + " with " + musician.getSong());
    }

    // Another static method
    static Musician createRapper(String name, String song) {
        return () -> name + " is performing " + song;
    }
}

class Pac implements Musician {
    @Override
    public String perform() {
        return getName() + " is performing " + getSong();
    }

    @Override
    public String getName() {
        return "2Pac";
    }

    @Override
    public String getSong() {
        return "Dear Mama";
    }
}

class BIG implements Musician {
    @Override
    public String perform() {
        return getName() + " is performing " + getSong();
    }

    @Override
    public String getName() {
        return "BIGGY";
    }

    @Override
    public String getSong() {
        return "Sky is the limit";
    }
}

public class MusicTest {
    public static void main(String[] args) {
        Musician[] musicians = new Musician[]{new Pac(), new BIG(), Musician.createRapper("Eminem", "Lose Yourself")};
        
        for (Musician musician : musicians) {
            System.out.println(musician.perform());
            Musician.announcePerformance(musician);
            System.out.println();
        }
    }
}