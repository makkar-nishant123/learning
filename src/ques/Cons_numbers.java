package ques;

public class Cons_numbers {

	public static void main(String[] args) {
		addInts("45,65,98,-98");
		
		dknw();
	}
	  public static void addInts(String line) {
	        String[] numbers = line.split(",");
	        Integer largest = Integer.parseInt(numbers[0].trim());
	        Integer secondLargest = 0;
	        for(String s : numbers) {
	            Integer converted = Integer.parseInt(s.trim());
	            if(converted > largest) {

	                secondLargest =  largest;
	                largest = converted;
	            }
	        }
	        System.out.println(largest + secondLargest);
	    }
	  
	  public static void dknw() {
		  String s  = "12342112334213343211";
		  String s1 = "";
		  int [] a = new int[s.length()];

		  for (int j = 0 ; j < s.length() ; j ++)
		  { 
			  s1 = "" + s.charAt(j);
			  a[j] = Integer.parseInt(s1);
		  }
		  
		  System.out.println(a.length);
		  int sum = 0  , max  = 0;
		  int n = 3;
		  for(int i=0; i < n   ;i++) 
		  {  sum = sum + a[i];
		  max=sum;
		  }

		  for(int i=n; i < a.length   ;i++) 
			  sum=sum+a[i]-a[i-n];
		  
		  System.out.println( max);
	    }
	  
	
}
