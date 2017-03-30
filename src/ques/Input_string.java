package ques;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Input_string {

	public static void main(String[] args) {
		String s = "aabbbccccaaa";

		// using_map(s);
		not_using_map(s);

	}

	private static String using_map(String s) {
		// TODO Auto-generated method stub
		String result = "";
		int n = s.length();
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();

		for (int i = 0; i < n; i++) {
			if (!m.containsKey(s.charAt(i))) {
				m.put(s.charAt(i), 1);
			} else {
				m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
			}
		}
		for (Map.Entry e : m.entrySet()) {
			result = result + e.getKey().toString() + e.getValue().toString();
		}
		System.out.println(result);

		return result;
	}

	private static void not_using_map(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		String result = "";
		String temp = "" + s.charAt(0);
		int c = 0;
		char x, y;
		int count = 1;

		for (int i = 0; i < n - 1; i++) {
			x = s.charAt(i);
			y = s.charAt(i + 1);
			c = Character.compare(x, y);
			if (c == 0) {
				count++;

			} else {
				result = result + temp + Integer.toString(count);
				count = 1;
				temp = "" + s.charAt(i + 1);
			}
		}
		result = result + temp + Integer.toString(count);
		System.out.println(result);
	}

	
}