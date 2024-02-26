public class TestClass {
    public static void main(String [] args){
      boolean booleanValue1 = true;
      boolean booleanValue2 = false;  

        System.out.println(! (booleanValue1 & !booleanValue2) + ", ") ;
        System.out.println(! (booleanValue1 | !booleanValue2) + ", ") ;
        System.out.println(! (booleanValue1 ^ !booleanValue2));
    }
}
