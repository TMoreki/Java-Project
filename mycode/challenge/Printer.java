public class Printer {
    public static void Printer(String name,String surname,double age,double miles) {

System.out.println("Hello " + name+" "+surname);
//System.out.println("What is your surname:" + surname);
System.out.println("You are "+ age+" years old");
System.out.println("The distance from the shop is" + miles + "miles");
double meters = MetersCalculator.calculate(miles);
System.out.println("The distance from the shop is" + meters + "meters");

    }
}