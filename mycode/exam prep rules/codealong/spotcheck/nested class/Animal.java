public class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    // Static nested class
    public static class AnimalInfo {
        public static void printInfo() {
            System.out.println("This is a static nested class in Animal");
        }
    }

    // Inner class (non-static nested class)
    public class AnimalBehavior {
        public void displayBehavior() {
            System.out.println(type + " has its own unique behavior");
        }
    }

    public void demonstrateLocalClass() {
        // Local class
        class LocalAnimalFeature {
            public void describeFeature() {
                System.out.println(type + " has some unique features");
            }
        }

        LocalAnimalFeature feature = new LocalAnimalFeature();
        feature.describeFeature();
    }

    public void demonstrateAnonymousClass() {
        // Anonymous class
        Runnable animalAction = new Runnable() {
            @Override
            public void run() {
                System.out.println(type + " is performing an action");
            }
        };

        animalAction.run();
    }
}