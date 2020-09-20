package Collection;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		//creating an object of Stack class  
		Stack <Integer> stk = new Stack<>();  
		System.out.println("stack: " + stk);  
		//pushing elements into the stack  
		pushelmnt(stk, 20);  
		pushelmnt(stk, 13);  
		pushelmnt(stk, 89);  
		pushelmnt(stk, 90);  
		pushelmnt(stk, 11);  
		pushelmnt(stk, 45);  
		pushelmnt(stk, 18);  
		//popping elements from the stack  
		popelmnt(stk);  
		popelmnt(stk);  
		//throws exception if the stack is empty  
		try   
		{  
		popelmnt(stk);  
		}   
		catch (EmptyStackException e)   
		{  
		System.out.println("empty stack");  
		}  
		}  
		//performing push operation  
		static void pushelmnt(Stack stk, int x)   
		{  
		//invoking push() method      
		stk.push(new Integer(x));                 //The method inserts an item onto the top of the stack
		System.out.println("push -> " + x);  
		//prints modified stack  
		System.out.println("stack: " + stk);  
		}  
		//performing pop operation  
		static void popelmnt(Stack stk)   
		{  
		System.out.print("pop -> ");  
		//invoking pop() method   
		Integer x = (Integer) stk.pop();          //The method removes an object at the top of the stack and returns the same object
		System.out.println(x);  
		//prints modified stack  
		System.out.println("stack: " + stk);  
		
		// Access element from the top of the stack  
		int element = (int) stk.peek();                //It looks at the element that is at the top in the stack. It also throws EmptyStackException if the stack is empty.
		//prints stack  
		System.out.println("Element at top: " + element);  
		  
		// Search an element  
		int location = stk.search("89");              //The method searches the object in the stack from the top. It parses a parameter that we want to search for. It returns the 1-based location of the object in the stack. Thes topmost object of the stack is considered at distance 1.
		System.out.println("Location of 89: " + location); 
		
		// Checks the Stack is empty or not  
		boolean rslt=stk.empty();                   //The method returns true if the stack is empty, else returns false.
		System.out.println("Is the stack empty or not? " +rslt);  
		// Find the size of the Stack  
		int x1=stk.size();                            //It returns the total number of elements (size of the stack) in the stack.
		System.out.println("The stack size is: "+x1);  
		
		//iteration over the stack  
		Iterator iterator = stk.iterator();            //It is the method of the Iterator interface. It returns an iterator over the elements in the stack. Before using the iterator() method import the java.util.Iterator package.
		while(iterator.hasNext())  
		{  
		Object values = iterator.next();  
		System.out.println(values);   
		}
	}

}
