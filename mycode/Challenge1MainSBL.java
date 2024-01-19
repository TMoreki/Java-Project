public class Challenge1Main {
    public static void main(String[] args) {
	 
String name = Prompter.prompt("What is your name");
String surname = Prompter.prompt("What is your surname");
String date= Prompter.prompt("What is the date of your Birth? DD/MM/YYYY:");
String distance = Prompter.prompt("How far is your favourite store from your home?");
boolean dateValid = DateValidator.isValid(date);
boolean numberValid =NumberValidator.isValid(distance);
double age = AgeCalculator.calculate(date);
double miles = MilesCalculator.calculate(distance);


int age = 0;
if (dateValid){

System.out.Println("You are" + age +" years old");
}else
{
System.out.Println("Date is not valid exiting");

}

if (distanceIsNumeric){

double miles;
System.out.Println("The distance from the shop is"+ miles +" miles");
}else
{
System.out.Println("Distance is not valid exiting");
	   		   
    }
}

}

