public class PcodeTest{
	public static void main(String[] argv){
	int[] array = new int[50];
    for(int i = 0; i<array.length;i++){
	  array[i] = i + 1;
	}
	printArray(array);

    System.out.println("\nIncremented array");

    incrementedArray(array);
   }

  public static void printArray(int[] array){
	for(int i = 0; i<array.length;i++){
	  System.out.print(array[i] +" ");
	}
	
  }
	
    public  static void incrementedArray(int[] array){
	for(int i = 0;i<array.length;i++){
     array[i] += 1;
     System.out.print(array[i]+ " ");
	}

    }
}