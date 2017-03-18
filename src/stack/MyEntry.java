package stack;

import java.util.Stack;

public class MyEntry {

	 public String reverseWord(String word){
         
	        StringBuilder sb = new StringBuilder();
	        Stack<Character> stack = new Stack<Character>();
	        for(int i=0;i< word.length();i++){
	            stack.push(word.charAt(i));
	        }
	        while(!stack.isEmpty()){
	            sb.append(stack.pop());
	        }
	        return sb.toString();
	    }
	     
	    public static void main(String a[]){
	    	MyEntry mwr = new MyEntry();
	        System.out.println("Java2Novice == "+mwr.reverseWord("Java2Novice"));
	        System.out.println("Java == "+mwr.reverseWord("Java"));
	        System.out.println("program == "+mwr.reverseWord("program"));
	    }
	
}
