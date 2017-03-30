
package Comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class sort_comp_list {
	
	public static void main(String[] args) {
		
		List<String> data = new LinkedList<String>();
		
		
		data.add("Ni45shant");
		data.add("Nishant");
		data.add("fgfdg");
		data.add("Nishafdgdfnt");
		data.add("df");
		data.add("Nisha43543$nt");
	
		for (String s : data)
			System.out.println(s);
		
		Collections.sort(data);
		System.out.println("===================");
		for (String s : data)
			System.out.println(s);
		
		Comparator c  = new Comparator();
		
	}

}
