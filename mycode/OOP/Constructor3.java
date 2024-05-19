public class Constructor3 {
    public Constructor3() {
        this("Peter", "Smith"); // Call the 2-arg constructor
        System.out.println("Running no-args constructor");
    }

    public Constructor3(String name, String surname) {
        this(name, surname, "Programmer"); // Call the 3-arg constructor
        System.out.println("Running 2-arg constructor: Name = " + name + ", Surname = " + surname);
    }

    public Constructor3(String name, String surname, String jobDescription) {
        System.out.println(name + " " + surname + " is a " + jobDescription);
    }
}