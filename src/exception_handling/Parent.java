package exception_handling;

public class Parent {
	
	public void test_parent()
	{
		try {
			System.out.println(123);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
