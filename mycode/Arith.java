public class Arith {
    public static void main(String[] args) {
     
    byte numByte = 10;
    short numShort = 5;
    int numInt = 5;
    long numLong = 10L;
    float numFloat = 3.0f;
    double numDouble = 2.0;

    double result = (numByte * numShort + numInt - numLong) / (numFloat + numDouble);
    System.out.println(result)
  }
}

