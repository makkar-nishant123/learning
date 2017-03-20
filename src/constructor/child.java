package constructor;

public class child extends Parent {

	public child()
	{
		System.out.println("D");

	}
	
	public child(int a )
	{
		System.out.println("C");

	}
	

	
	public static void main(String[] args) {
		child c = new child();
	}
	
}
