public class Shooter {
    public String shoot() {
        return "John";
    }

    public void shoot(int count) {
        for (; count > 0; count--) {
            System.out.println("booom!!!");
        }
    }
}