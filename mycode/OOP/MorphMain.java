public class MorphMain {
    public static void main(String[] args) {
        // Create an instance of Morph1 named morph1
        Morph1 morph1 = new Morph1();

        // Create a variable called target of type Object, initialize it to null
        Object target = null;

        // Assign the instance of Morph1 to variable target
        target = morph1;

        // Downcast the target instance back to Morph1 and assign it to inst1
        Morph1 inst1 = (Morph1) target;
    }
}