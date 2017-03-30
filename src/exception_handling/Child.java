package exception_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Child extends Parent {

	public void test_parent() throws NullPointerException , ArithmeticException
	{
		System.out.println(123);
		
		File f = new File("");
		try {
			FileInputStream fstr = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int a = 5/0;
	}
	
}
