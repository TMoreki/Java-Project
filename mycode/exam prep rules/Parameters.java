// Parameters are declared in method signatures
  public void rule1(int param1, String param2) {
        System.out.println("Rule 1: " + param1 + ", " + param2);
    }
// Each parameter has a type and name
    public void rule2(int age, String name) {
        System.out.println("Rule 2: Age is " + age + ", Name is " + name);
    } 
// Multiple parameters are separated by commas
  public void rule3(int x, double y, String z) {
        System.out.println("Rule 3: " + x + ", " + y + ", " + z);
    }
// Order matters when passing arguments
    public void rule4(String first, String last) {
        System.out.println("Rule 4: " + first + " " + last);
    }
// Primitive types are passed by value
   public void rule5(int x) {
        x = 10; // This change is not reflected outside the method
    }
// Objects are passed by reference
public void rule6(StringBuilder sb) {
        sb.append(" World"); // This change affects the original object
    }
// Variable-length (varargs) parameters use "..." syntax
     public void rule7(String... args) {
        for (String arg : args) {
            System.out.println("Rule 7: " + arg);
        }
    }
// Final parameters cannot be modified within the method
public void rule8(final int x) {
        // x = 5; // This would cause a compilation error
        System.out.println("Rule 8: " + x);
    }

      public static void main(String[] args) {
        ParameterRulesExamples examples = new ParameterRulesExamples();

        examples.rule1(42, "Hello");
        examples.rule2(30, "John");
        examples.rule3(1, 2.5, "Three");
        examples.rule4("John", "Doe");

        int num = 5;
        examples.rule5(num);
        System.out.println("Rule 5: num is still " + num);

        StringBuilder sb = new StringBuilder("Hello");
        examples.rule6(sb);
        System.out.println("Rule 6: sb is now " + sb);

        examples.rule7("One", "Two", "Three");
        examples.rule8(100);
    }
}