import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("lemon"); 
        list.add("apple");
        list.add("pineapple");
        list.add("melon"); 
        
        
        System.out.println("Before removing: " + list);
        
        
        list.remove("apple");
        list.remove("lemon");
        
        System.out.println("After removing: " + list);

        // for(int i = 0; i < list(); i++){
        //     System.out.println(list);
        
    }
}





