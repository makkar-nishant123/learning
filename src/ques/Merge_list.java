package ques;

import java.util.ArrayList;

public class Merge_list {
	
	public static void main(String[] args) {
		ArrayList<String> d = new ArrayList<String>(7);
		ArrayList<String> d1 = new ArrayList<String>(); 
		d.add(0, "d");
		d.add(1, "g");
		d.add(2, "f");
		d.add(3, "e");
		d1.add(0, "c");
		d1.add(1, "a");
		d1.add(2,"b");
		
		d.addAll(d1);
		
		for (String s : d)
			System.out.println(s);
	}
	
}
