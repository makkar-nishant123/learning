package ques;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_repetition {
	
	public static void main(String[] args) {
		using_map("arizona");
		//loop_and_find("Nisahdjnksa"); 
	}
	
	private static String using_map(String s) {
		// TODO Auto-generated method stub
		String result = "";
		int n = s.length();
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		char c ;
		for (int i = 0; i < n; i++) {
 c = Character.toLowerCase(s.charAt(i));
			if (!m.containsKey(c)) {
				m.put(c, 1);
			} else {
				m.put(c, m.get(c) + 1);
			}
		}
		for (Map.Entry e : m.entrySet()) {
			if (Integer.parseInt(e.getValue().toString()) == 1 )
			{System.out.println(e.getKey());
		break;}
		}
		

		return result;
	}
	
	public static void loop_and_find(String s )
	{
		char [] a = s.toCharArray();
		for (int i = 0 ; i < a.length ; i ++)
		{
			for (int j = 0 ; j < a.length ; j ++ )
			{if (a[i] == a[j])
				continue;
			}		
			
		}
	}
}