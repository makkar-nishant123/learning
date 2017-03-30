package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class learn_exceptions {
	
	public static void main(String args[]) throws FileNotFoundException {		
	      int a = testing();
	      System.out.println(a);
	}
	
	public static int  testing() throws FileNotFoundException {
	File file = new File("E://file.txt");
    try {
		FileReader fr = new FileReader(file);
		int a = 511/1;
		System.out.println(a);
		return 1;

	} /*catch (Exception e) {
		// TODO Auto-generated catch block

		e.printStackTrace();
		return 2;

	}  */
    catch (ArithmeticException e) {
		// TODO Auto-generated catch block

		e.printStackTrace();

	} 
   
   
   
    finally
    {
    	return 5;
    }
    
  
 }
}
