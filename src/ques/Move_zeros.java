package ques;

import java.util.Arrays;

public class Move_zeros {

	static int count = 0;
	public static void main(String[] args) {
		int [] a = {1,4,0,0,3,3,2,0,3,31,0,5};
		
		move_zero(a);
	}

	private static void move_zero(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < a.length ; i++)
			if (a[i] != 0)
				{
				a[count++]=a[i];
				
				}
		while (count < a.length)
		{
			a[count++] = 0;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
