package ques;

public class find_from_plusandminus {

	
	public static void main(String[] args) {
int [] anArray = {3,2,1,2,-1,3,-1,3,-10,0};
		  int currentSum = 0;
		  int currentMax = 0;

		  for (int j=0; j < anArray.length; j++)
		  {
		    currentSum += anArray[ j ];

		   if (currentMax < currentSum) 
		     currentMax = currentSum;
		   else if (currentSum < 0)
		     currentSum = 0;
		  }
		 
		  System.out.println(currentMax);
		     
		}
	}

