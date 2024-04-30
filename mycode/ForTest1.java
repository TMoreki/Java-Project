public class ForTest1 {
    public static void main(String[] args) {
       
        for(int i = 50; i >= 1; i-= 2){
                 
        System.out.println(i + " "); 
    }
   }
}



 // should the variable always be declared outside the loop?
 
// consult on the above wrg to printsouts explain the the increment part on both inner and outter loop
// is the outerloop responsible for the rows? and is the inner loop responsible for the colums?
// when you continue; the print out is odd numbers , get the logic behind it 
// the logic behind it is that when the condition is meet then skip the current iteration and increment meaning that if the number is even then skip it and then increment hance the odd numbers
// when using a break why i fthe condition is even why not continue to increment but break after 1?