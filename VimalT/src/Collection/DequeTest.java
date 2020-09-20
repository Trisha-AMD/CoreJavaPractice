package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

	/*
	 * Java Deque Interface is a linear collection that supports element insertion
	 * and removal at both ends. Deque is an acronym for "double ended queue".
	 */
	
	/*
	 * The ArrayDeque class provides the facility of using deque and
	 * resizable-array. 
	 * It inherits AbstractCollection class and implements the
	 * Deque interface.
	 * 
	 * The important points about ArrayDeque class are:
	 * Unlike Queue, we can add or
	 * remove elements from both sides. Null elements are not allowed in the
	 * ArrayDeque. ArrayDeque is not thread safe, in the absence of external
	 * synchronization. ArrayDeque has no capacity restrictions. ArrayDeque is
	 * faster than LinkedList and Stack.
	 */
	
	
	public static void main(String[] args) {
		
		Deque<String> deque=new ArrayDeque<String>();  
	    deque.offer("arvind");  
	    deque.offer("vimal");  
	    deque.add("mukul");  
	    deque.offerFirst("jai");  
	    System.out.println("After offerFirst Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	    //deque.poll();  
	    //deque.pollFirst();//it is same as poll()  
	    deque.pollLast();  
	    System.out.println("After pollLast() Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	}

}
