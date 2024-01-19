public class MathTest{
    static int players = 0;
      public static void main(String[] args) {
        System.out.println("players online : " + players++);  
        System.out.println(" The value of players is " + players);
        System.out.println(" The value of players is now " + ++players);
    }
}