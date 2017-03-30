package ques;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class display_dupl {
	 static Node head;
		static int count = 0;
	    static class Node {

	        int data;
	        Node next;

	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }

	    /* Function to remove duplicates from an
	       unsorted linked list */
	    void remove_duplicates() {
	        Node ptr1 = null, ptr2 = null, dup = null;
	        ptr1 = head;

	        /* Pick elements one by one */
	        while (ptr1 != null && ptr1.next != null) {
	            ptr2 = ptr1;

	            /* Compare the picked element with rest
	                of the elements */
	            while (ptr2.next != null) {

	                /* If duplicate then delete it */
	                if (ptr1.data == ptr2.next.data) {

	                    /* sequence of steps is important here */
	                    dup = ptr2.next;
	                    ptr2.next = ptr2.next.next;
	                    System.out.println("========DUP is " +  dup.data);
	                    System.gc();
	                } else /* This is tricky */ {
	                    ptr2 = ptr2.next;
	                }
	            }
	            ptr1 = ptr1.next;
	        }
	    }

	    void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }

	    public static void main(String[] args) {
	   // calling_list();
	    	LinkedList<Integer> l = new LinkedList();
	    	l.add(111);
	    	l.add(13423);
	    	l.add(342);
	    	l.add(342);
	    	l.add(111);
	    	l.add(1);
	    	l.add(111);
	    	l.add(13423);
	    	l.add(13423);
	    	l.add(13423);
	    	new_methods(l);
	    }

		private static <T> void new_methods(LinkedList<Integer> l) {
			// TODO Auto-generated method stub
			
		/*	for (int i = 0; i < l.size() ; i++)
			{
				for (int j = 0; j < l.size() ; j++)
				{
					if (l.get(i) == l.get(j))
						a[i] =  l.get(j);
				}
			}*/
		
	T[] test = 		l.toArray(new T[l.size()]);
	
			
		/*	for (int i = 0; i < l.size() ; i++)
			{	
				if (i != count ){
				if (l.get(count) == l.get(i))
				{
					System.out.println("DUPLICATE" + l.get(count));
					l.remove(i);
				}
				}
				if ( count >= l.size())
					{count ++;
					new_methods(l);
					}
				if ( )
				
			}*/
			
		}

		private static void calling_list() {
			// TODO Auto-generated method stub
			display_dupl list = new display_dupl();
	        list.head = new Node(12111);
	        list.head.next = new Node(12111);
	        list.head.next.next = new Node(12111);
	        list.head.next.next.next = new Node(11);
	        list.head.next.next.next.next = new Node(12);
	        list.head.next.next.next.next.next = new Node(11);
	        list.head.next.next.next.next.next.next = new Node(10);

	        System.out.println("Linked List before removing duplicates : \n ");
	        list.printList(head);
	       
	        
	        list.remove_duplicates();
	        System.out.println("");
	        System.out.println("Linked List after removing duplicates : \n ");
	        list.printList(head);
		}
	    
	    
	    
	    
	    

}
