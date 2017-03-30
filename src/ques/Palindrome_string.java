package ques;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// reversing_and_comparing(s);
		reversing_and_comparingby2(s);
		// int n = sc.nextInt();
		// integers_palindrome(n);
	}

	private static void integers_palindrome(int p) {
		// TODO Auto-generated method stub
		int n = p;
		int r, sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (sum == p)
			System.out.println(true);
	}

	private static void reversing_and_comparing(String s) {
		// TODO Auto-generated method stub

		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			reverse = reverse + s.charAt(i);

		}
		System.out.println(reverse);
		if (s.equals(reverse))
			System.out.println(true);
	}

	private static void reversing_and_comparingby2(String s) {
		// TODO Auto-generated method stub

		char[] a = s.toCharArray();
		
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {

			{
				char temp = a[i];
				a[j] = a[i];
				a[j] = temp;
				
			}
			String reverse = "";
			for (char k : a)
				 reverse   = reverse + k;
if (s.equals(reverse))
	System.out.println(true);
		}

	}
}