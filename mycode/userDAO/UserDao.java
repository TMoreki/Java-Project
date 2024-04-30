import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    String name;
    String surname;
    String email;
    LocalDate dateOfBirth;

    public User(String name, String surname, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
}

public class UserDao {
    private static List<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    listUsers();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nUser Management System");
        System.out.println("1. Add a user");
        System.out.println("2. Delete a user");
        System.out.println("3. Update a user");
        System.out.println("4. List users");
        System.out.print("Enter your choice: ");
    }

    private static void addUser() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter date of birth (yyyy-MM-dd): ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE);

        User user = new User(name, surname, email, dateOfBirth);
        users.add(user);

        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        System.out.printf("Hello %s %s, your details have been saved to the database. You are %d years old.%n", name, surname, age);
    }

    private static void deleteUser() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        User userToDelete = findUserByEmail(email);
        if (userToDelete != null) {
            users.remove(userToDelete);
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("User not found.");
        }
    }

    private static void updateUser() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        User userToUpdate = findUserByEmail(email);
        if (userToUpdate != null) {
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();

            System.out.print("Enter new surname: ");
            String surname = scanner.nextLine();

            System.out.print("Enter new email: ");
            String newEmail = scanner.nextLine();

            System.out.print("Enter new date of birth (yyyy-MM-dd): ");
            LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE);

            userToUpdate.name = name;
            userToUpdate.surname = surname;
            userToUpdate.email = newEmail;
            userToUpdate.dateOfBirth = dateOfBirth;

            System.out.println("User updated successfully.");
        } else {
            System.out.println("User not found.");
        }
    }

    private static void listUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            System.out.println("List of users:");
            for (User user : users) {
                System.out.printf("%s %s (%s), Date of Birth: %s%n", user.name, user.surname, user.email, user.dateOfBirth);
            }
        }
    }

    private static User findUserByEmail(String email) {
        for (User user : users) {
            if (user.email.equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }
}