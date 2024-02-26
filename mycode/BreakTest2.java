public class BreakTest2 {
    public static void main(String[] args) {       
        outer:for(int i = 0;i<3;i++){
            System.out.println("outer:"+i);
            inner:for(int j = 0;j<3;j++){
                System.out.println(" inner:"+j);
                if(i == 2){
                 break inner;
                }
                innest:for(int k = 0;k<3;k++){
                    System.out.println("  innest:"+k);
                }            	
            }        	
        }
    }
}

