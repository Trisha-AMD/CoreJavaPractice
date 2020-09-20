package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	
	/*
	 * Java Queue interface orders the element in FIFO(First In First Out) manner.
	 * In FIFO, first element is removed first and last element is removed at last.
	 * The PriorityQueue class provides the facility of using queue. But it does not
	 * orders the elements in FIFO manner. It inherits AbstractQueue class.
	 */
	
	public static void main(String[] args) {
		
		 /*1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.*/ 
		 System.out.println("\n1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.");

		  PriorityQueue<String> queue=new PriorityQueue<String>();  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  System.out.println("Elements of the Priority Queue: ");
		  System.out.println(queue);
		 
		 
		 
		 /*2. Write a Java program to iterate through all elements in priority queue. */
		 System.out.println("\n2. Write a Java program to iterate through all elements in priority queue.");

		 PriorityQueue<String> pq = new PriorityQueue<String>();  
		  pq.add("Red");
		  pq.add("Green");
		  pq.add("Orange");
		  pq.add("White");
		  pq.add("Black");
		  System.out.println("Elements of the Priority Queue: ");
		  // iterate the Priority Queue
		  for (String element : pq) {
		    System.out.println(element);
		  }
		 
		 
		 /*3. Write a Java program to add all the elements of a priority queue to another priority queue.*/ 
		 System.out.println("\n3. Write a Java program to add all the elements of a priority queue to another priority queue.");

		 PriorityQueue<String> queue1 = new PriorityQueue<String>();  
		  queue1.add("Red");
		  queue1.add("Green");
		  queue1.add("Orange");
		  System.out.println("Priority Queue1: "+queue1);
		  PriorityQueue<String> queue2 = new PriorityQueue<String>();  
		  queue2.add("Pink");
		  queue2.add("White");
		  queue2.add("Black");
		  System.out.println("Priority Queue2: "+queue2);
		    // adding queue2 to queue1
		   queue1.addAll(queue2);
		   System.out.println("New Priority Queue1: "+queue1);
		 
		 
		 
		 /*4. Write a Java program to insert a given element into a priority queue. */
		 System.out.println("\n4. Write a Java program to insert a given element into a priority queue.");

		 System.out.println("Original Priority Queue: "+pq);
		   
		   // Inserts the specified element into this priority queue.
		    pq.offer("Blue");
		 
		    System.out.println("The New Priority Queue: " + pq);
		 
		 
		 
		 /*5. Write a Java program to remove all the elements from a priority queue.*/ 
		 System.out.println("\n5. Write a Java program to remove all the elements from a priority queue.");

		 System.out.println("Original Priority Queue: "+pq);
		   
		   // Removing all the elements from the Priority Queue
		    pq.clear();
		 
		    System.out.println("The New Priority Queue: " + pq);
		 
		 
		 
		 /*6. Write a Java program to count the number of elements in a priority queue.*/ 
		 System.out.println("\n6. Write a Java program to count the number of elements in a priority queue. ");

		 System.out.println("Priority Queue: " + queue1);
		    System.out.println("Size of the Priority Queue: " + queue1.size());
		 
		 
		 /*7. Write a Java program to compare two priority queues. */
		 System.out.println("\n7. Write a Java program to compare two priority queues.");

		 System.out.println("First Priority Queue: "+queue);
		 System.out.println("Second Priority Queue: "+queue1);
		//comparison output in Priority Queue
         for (String element : queue1){
             System.out.println(queue.contains(element) ? "Yes" : "No");
         }
		 
		 /*8. Write a Java program to retrieve the first element of the priority queue.*/ 
		 System.out.println("\n8. Write a Java program to retrieve the first element of the priority queue.");

		// Create Priority Queue
	      PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();  
	      PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();  
	        
	   // Add numbers in the Queue
	   pq1.add(10);
	   pq1.add(22);
	   pq1.add(36);
	   pq1.add(25);
	   pq1.add(16);
	   pq1.add(70);
	   pq1.add(82);
	   pq1.add(89);
	   pq1.add(14);
	   System.out.println("Original Priority Queue: "+pq1);
	   System.out.println("The first element of the Queue: "+pq1.peek());
		 
		 
		 /*9. Write a Java program to retrieve and remove the first element. */
		 System.out.println("\n9. Write a Java program to retrieve and remove the first element");

		 System.out.println("Original Priority Queue: "+pq1);
		   System.out.println("Removes the first element: "+pq1.poll());
		   System.out.println("Priority Queue after removing first element: "+pq1);
		 
		 
		 /*10. Write a Java program to convert a priority queue to an array containing all of the elements of the queue.*/ 
		 System.out.println("\n10. Write a Java program to convert a priority queue to an array containing all of the elements of the queue.");

		 System.out.println("Original Priority Queue: "+queue1);
		   
		   //Convert a linked list to array list    
		   List<String> array_list = new ArrayList<String>(queue1);
		   System.out.println("Array containing all of the elements in the queue: "+array_list);
		 
		/*
		 * 11. Write a Java program to convert a Priority Queue elements to a string
		 * representation.
		 */ 
		 System.out.println("\n11. Write a Java program to convert a Priority Queue elements to a string representation.");

		//Convert Priority Queue to a string representation
		   String str1;
		   str1 = queue.toString();
		   System.out.println("String representation of the Priority Queue: "+str1);
		 
		 
		
	}

	}
	
