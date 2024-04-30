public class Thebe{
	public static void main(String [] args){
     
     int a = 10; 
     int b = 15; 
     int c = 5;

boolean bool;
String age = "";
String age2 = "";



if (a > b) {
    if (a > c) {
        bool = true;
        age = a;
    } else {
        bool = false;
        age2 = c;
    }
} else {
    if (b > c) {
        bool = true;
        age = b;
    } else {
        bool = false;
        age2 = c;
    }
}

if (bool) {
    System.out.println("Tom is: " + age + " years old");
} else {
    System.out.println("Tom is: " + age2 + " years old");
}


	}
}