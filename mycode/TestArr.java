public class TestArr {
    public static void main(String [] args) {
     
   int a = 5;
   int b = 2;
   b *= ++a + --b * b++;
   if(b++ == b){
    a++;
    b++;
    System.out.println(b + " " + a);

   } 
   if((a += b * a) >= (b * a + a) | (++a > b++) && (a += b * a) <= (b * a + a)){
    System.out.println(a + " " + b);

   }
   else{
    System.out.println(a + " " + a);

   }
   System.out.println(b + " " + a);
   
     
     }  
    
}
