public class Shooter {

    public String shoot() {
        return "John";
    }

    public void shoot(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("booom!!!");
        }
    }

    public static void main(String[] args) {
        Shooter shooter = new Shooter();
        System.out.println(shooter.shoot()); // Output: John
        shooter.shoot(10); // Output: booom!!! (10 times)
    }
}
