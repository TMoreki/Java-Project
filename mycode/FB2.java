public class FB2{
public static void main(String [] args){

for(int i=1; i<=100; i++){
switch(i % 15){
case 0:
System.out.println("fb");
break;
case 3:
case 6:
case 9:
case 12:
System.out.println("f");
break;
case 5:
case 10:
System.out.print("B");
break;
default:
System.out.println(i);
   }
  }
 }
} 