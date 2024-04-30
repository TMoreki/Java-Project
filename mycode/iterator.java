import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("lemon"); 
        list.add("apple");
        list.add("pineapple");
        list.add("melon");
        
        
        Iterator<String> iterator = list.iterator();
        
        
        System.out.println("Iterating through the ArrayList:");
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
