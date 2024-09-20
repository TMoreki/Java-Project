public class Main{
	public static void main(String[] args){
      Print print = new Book();
      Book book = new Book();
      Book.setPage();//referencint the method  
      book.setLength("hello");// pass the actual string value

      //create an instance of default by reffencing the interface name 
      // we cant create an instance of an interface directlt, so we refferense
      System.out.println("page: " + print.getPage());

      //static,you call the method by refferencing the inteface name 
      System.out.println("setPage:" + Print.setPage());// printing out the method
        // safe it in separate clasees and compile 
	}
}