public class Finalize{
	protected void finalize(){
	System.out.println("Calling finalize");
}

public static void main(String[] args){
	Finalize f = new Finalize();
}
}