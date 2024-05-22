public class MainShooter {
    public static void main(String[] args) {
        Shooter shooter = new Shooter();

        // Call the shoot() method
        String shootResult = shooter.shoot();
        System.out.println("Shoot result: " + shootResult);

        // Call the shoot(int count) method with a parameter of 5
        System.out.println("Firing 5 shots:");
        shooter.shoot(5);
    }
}

