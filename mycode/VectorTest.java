import java.util.*;

public class VectorTest {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("lemon"); 
        v.add("apple");
        v.add("pineapple");
        v.add("melon");
           
        String[] array = v.toArray(new String[v.size()]);
        
    
        System.out.println("Contents of the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
