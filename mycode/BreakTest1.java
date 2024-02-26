public class BreakTest1 {
    public static void main(String[] args) {
       
        for(int i = 0;i<10;i++){
            System.out.println("outer:"+i);
            if(i == 7){
                break;
            }
        }
    }           
}
