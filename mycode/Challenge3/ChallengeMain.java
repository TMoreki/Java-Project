public class ChallengeMain {
    public static void main(String[] args) {

            String block = "";
            String teacher ="";
            String peTeacher = ""; 
            String gStr = "";
            String name = "";
         
            name = Prompter.prompt("Enter your name:");
            gStr = Prompter.prompt("Enter your grade:");
            boolean isValid = NumberValidator.validator(gStr);

            if (name.isBlank() || gStr.isBlank()) {
                System.out.println("Error: Name or grade cannot be blank.");
                
            }

             
           int gradeStr = Integer.parseInt(gStr);

          

            if (gradeStr >= 0 && gradeStr <= 7) {
                block = "Block B";
                teacher = "Mrs Rhino";
                peTeacher = "Mrs Zebra";
            } else if (gradeStr >= 8 && gradeStr <= 12) {
                block = "Block A";
                teacher = "Mrs Lion";
                peTeacher = "Mr Tiger";
            } else {
                System.out.println("Error: Grade is invalid.");
                return;
            }
        System.out.println("Welcome, " + name + "!");
        System.out.println("You are in " + block + ".");
        System.out.println("Your class teacher is " + teacher + ".");
        System.out.println("Your peTeacher  " + peTeacher + ".");    
            }
        }
        
        
    
