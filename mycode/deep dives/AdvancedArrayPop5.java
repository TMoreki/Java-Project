public class AdvancedArrayPop5{
    public static void main(String [] args){


int[] intArray = new int[5];
System.out.println("Integer Array: ");
for (int i = 0; i < intArray.length; i++) {
    intArray[i] = 0; 
    System.out.print(intArray[i] + " ");
}
System.out.println();


boolean[] booleanArray = new boolean[5];
System.out.println("Boolean Array: ");
for (int i = 0; i < booleanArray.length; i++) {
    booleanArray[i] = false; // 
    System.out.print(booleanArray[i] + " ");
}
System.out.println();


char[] charArray = new char[5];
System.out.println("Character Array: ");
for (int i = 0; i < charArray.length; i++) {
    charArray[i] = '0'; 
    System.out.print(charArray[i] + " ");
}
System.out.println();


String[] stringArray = new String[5];
System.out.println("String Array: ");
for (int i = 0; i < stringArray.length; i++) {
    stringArray[i] = "0"; 
    System.out.print(stringArray[i] + " ");
}
System.out.println();

   }
}



// PSEUDOCODE

// program AdvancedArrayPop5
//     function main
//         declare intArray as an array of integers with size 5
//         print "Integer Array: "
//         for i from 0 to length of intArray - 1
//             set the value at index i of intArray to 0
//             print the value at index i of intArray followed by a space
//         print a newline character

//         declare booleanArray as an array of booleans with size 5
//         print "Boolean Array: "
//         for i from 0 to length of booleanArray - 1
//             set the value at index i of booleanArray to false
//             print the value at index i of booleanArray followed by a space
//         print a newline character

//         declare charArray as an array of characters with size 5
//         print "Character Array: "
//         for i from 0 to length of charArray - 1
//             set the value at index i of charArray to '0'
//             print the value at index i of charArray followed by a space
//         print a newline character

//         declare stringArray as an array of strings with size 5
//         print "String Array: "
//         for i from 0 to length of stringArray - 1
//             set the value at index i of stringArray to "0"
//             print the value at index i of stringArray followed by a space
//         print a newline character
