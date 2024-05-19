public class ObjectA {

    public static void main(String[] args) {
        ObjectB objectB = new ObjectB();
        objectB.add(1, 2, 3); // Changed to add 3 values
    }
}

class ObjectB {
    public void add(int val1, int val2, int val3) { // Added a third parameter
        int sum = val1 + val2 + val3; // Added val3 to the sum
        System.out.println("val1 + val2 + val3 = " + sum); // Changed print statement
    }
}