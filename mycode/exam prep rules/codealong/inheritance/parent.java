class GrandParent{
	public void money(){
		System.out.println("Grandparent money");
	}

}
public class Parent extends GrandParent{
   public static void main(String[]args){
   	Parent parent = new Parent();
   	parent.money();
   }
}

