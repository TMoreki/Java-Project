public class Challenge1Main {
    public static void main(String[] args) {
	 
String name = Prompter.prompt("What is your name");
String surname = Prompter.prompt("What is your surname");
String date= Prompter.prompt("What is the date of your Birth? DD/MM/YYYY:");
String distance = Prompter.prompt("How far is your favourite store from your home?");
boolean dateValid = DateValidator.isValid(date);
boolean numberValid =NumberValidator.isValid(distance);




			
int age = 0;
if (dateValid){

age = (int)AgeCalculator.calculate(date);
System.out.println("Your age is: " + age);
}else
{
System.out.println("Date is not valid ");

}



if (numberValid){

double miles = MilesCalculator.calculate(distance);
System.out.println("The distance to your favourite store is: " + miles + "miles");
Printer.Printer(name, surname, age, miles);
}else
{
System.out.println("Distance is not valid");
	   		   
    }
}

}



