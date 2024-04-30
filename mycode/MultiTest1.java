public class MultiTest1 {
    public static void main(String[] args) {
    	
        int [][] lottogroups = {{1111,2222,3333,4444},{6666,7777,8888,9999},{11111,121212,131313}};
    	
        int groupIndex = 0;
        for (int[] group : lottogroups) {
            System.out.println("Group :" + groupIndex);
            int valueIndex = 0;
            for (int value : group) {
                System.out.println("  Value " + valueIndex + " = " + value);
                valueIndex++;
            }
            groupIndex++;
        }
    }
}