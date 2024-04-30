public class UserDao2 {
    public static void main(String[] args) {
        String[][] users = new String[0][4]; // [name, surname, email, dateOfBirth]

        while (true) {
            displayMenu();
            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    addUser(users);
                    break;
                case 2:
                    deleteUser(users);
                    break;
                case 3:
                    updateUser(users);
                    break;
                case 4:
                    listUsers(users);
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
    }

    private static void addUser(String[][] users) {
        String name = readString("Enter name: ");
        String surname = readString("Enter surname: ");
        String email = readString("Enter email: ");
        String dateOfBirth = readString("Enter date of birth (yyyy-MM-dd): ");

        int age = calculateAge(dateOfBirth);
        System.out.printf("Hello %s %s, your details have been saved to the database. You are %d years old.%n", name, surname, age);

        users = addToArray(users, new String[]{name, surname, email, dateOfBirth});
    }

    private static void deleteUser(String[][] users) {
        String email = readString("Enter email: ");
        int index = findUserByEmail(users, email);
        if (index != -1) {
            users = removeFromArray(users, index);
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("User not found.");
        }
    }

    private static void updateUser(String[][] users) {
        String email = readString("Enter email: ");
        int index = findUserByEmail(users, email);
        if (index != -1) {
            String name = readString("Enter new name: ");
            String surname = readString("Enter new surname: ");
            String newEmail = readString("Enter new email: ");
            String dateOfBirth = readString("Enter new date of birth (yyyy-MM-dd): ");

            users[index] = new String[]{name, surname, newEmail, dateOfBirth};
            System.out.println("User updated successfully.");
        } else {
            System.out.println("User not found.");
        }
    }

    private static void listUsers(String[][] users) {
        if (users.length == 0) {
            System.out.println("No users found.");
        } else {
            System.out.println("List of users:");
            for (String[] user : users) {
                System.out.printf("%s %s (%s), Date of Birth: %s%n", user[0], user[1], user[2], user[3]);
            }
        }
    }

    private static int findUserByEmail(String[][] users, String email) {
        for (int i = 0; i < users.length; i++) {
            if (users[i][2].equalsIgnoreCase(email)) {
                return i;
            }
        }
        return -1;
    }

    private static String readString(String prompt) {
        System.out.print(prompt);
        return new java.util.Scanner(System.in).nextLine();
    }

    private static int readInt(String prompt) {
        System.out.print(prompt);
        return new java.util.Scanner(System.in).nextInt();
    }

    private static int calculateAge(String dateOfBirth) {
        int currentYear = java.time.LocalDate.now().getYear();
        int birthYear = Integer.parseInt(dateOfBirth.substring(0, 4));
        return currentYear - birthYear;
    }

    private static String[][] addToArray(String[][] arr, String[] element) {
        String[][] newArr = new String[arr.length + 1][4];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;
        return newArr;
    }

    private static String[][] removeFromArray(String[][] arr, int index) {
        String[][] newArr = new String[arr.length - 1][4];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}