public class Pseudocode1{
	public static void main(String[] argv){
	int[] array = new int[50];

	for(int i = 0; i<array.length;i++){
	  array[i] = i + 1;
	  System.out.print(array[i] +" ");
	}
	System.out.println();

	System.out.println("Incremented array");

	for(int i = 0;i<array.length;i++){
     array[i] += 1;
     System.out.print(array[i]+ " ");
	}
  }	

}




public class Pseudocode2{
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



// Declare a multi-dimensional array of size 10 x 50
int[][] arr = new int[10][50];

// Iterate through and populate the inner arrays with random numbers
for (int i = 0; i < 10; i++) {
   for (int j = 0; j < 50; j++) {
       arr[i][j] = (int) (Math.random() * 100); // Generate random numbers between 0 and 99
   }
}

// Iterate through the arrays and print each element
System.out.println("Original array:");
for (int i = 0; i < 10; i++) {
   for (int j = 0; j < 50; j++) {
       System.out.print(arr[i][j] + " ");
   }
   System.out.println(); // Move to the next line after printing each inner array
}

// Sort each of the inner arrays in ascending order
for (int i = 0; i < 10; i++) {
   Arrays.sort(arr[i]);
}

// Iterate through the arrays and print each element
System.out.println("\nSorted array:");
for (int i = 0; i < 10; i++) {
   for (int j = 0; j < 50; j++) {
       System.out.print(arr[i][j] + " ");
   }
   System.out.println(); // Move to the next line after printing each inner array
}