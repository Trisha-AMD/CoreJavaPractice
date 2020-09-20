package Collection;

import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetTest {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to create a new tree set, add some colors (string) and
		 * print out the tree set.
		 */
		System.out.println("\n.1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set");
		
		TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("Red");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("White");
		  tree_set.add("Black");
		  System.out.println("Tree set: ");
		  System.out.println(tree_set);
		
		/* Write a Java program to iterate through all elements in a tree set */
		System.out.println("\n.2. Write a Java program to iterate through all elements in a tree set.");
		
		// Print the tree list
		  for (String element : tree_set) {
		    System.out.println(element);
		    }
	   
		/*
		 * Write a Java program to add all the elements of a specified tree set to
		 * another tree set.
		 */
		System.out.println("\n.3. Write a Java program to add all the elements of a specified tree set to another tree set.");
		
		TreeSet<String> tree_set1 = new TreeSet<String>();
		  tree_set1.add("Red");
		  tree_set1.add("Green");
		  tree_set1.add("Orange");
		  System.out.println("Tree set1: "+tree_set1);
		  TreeSet<String> tree_set2 = new TreeSet<String>();
		  tree_set2.add("Pink");
		  tree_set2.add("White");
		  tree_set2.add("Black");
		  System.out.println("Tree set2: "+tree_set2);
		   // adding treetwo to treeone
		   tree_set1.addAll(tree_set2);
		   System.out.println("Tree set1: "+tree_set1);
		
		/*Write a Java program to create a reverse order view of the elements contained in a given tree set.*/
		System.out.println("\n.4. Write a Java program to create a reverse order view of the elements contained in a given tree set.");
		
		// print original list
		   System.out.println("Original tree set:" + tree_set);  
		     Iterator it = tree_set.descendingIterator();
		     // Print list elements in reverse order
		     System.out.println("Elements in Reverse Order:");
		     while (it.hasNext()) {
		        System.out.println(it.next());
		     }
		
	    /*Write a Java program to get the first and last elements in a tree set.*/
		System.out.println("\n.5. Write a Java program to get the first and last elements in a tree set.");
		
		// Find first element of the tree set
	    Object first_element = tree_set.first();
	    System.out.println("First Element is: "+first_element);
	 
	    // Find last element of the tree set
	    Object last_element = tree_set.last();
	    System.out.println("Last Element is: "+last_element);
		
		/*Write a Java program to clone a tree set list to another tree set*/
		System.out.println("\n.6. Write a Java program to clone a tree set list to another tree set.");
		
		// create an empty tree set
	     TreeSet<String> t_set = new TreeSet<String>();
	   // use add() method to add values in the tree set
	          t_set.add("Red");
	          t_set.add("Green");
	          t_set.add("Black");
	          t_set.add("Pink");
	          t_set.add("orange");
	     
	   System.out.println("Original tree set:" + t_set);  
	    TreeSet<String> new_t_set = (TreeSet<String>)t_set.clone();
	          System.out.println("Cloned tree list: " + t_set);
	          
		/*Write a Java program to get the number of elements in a tree set.*/
		System.out.println("\n.7. Write a Java program to get the number of elements in a tree set. ");
		
		System.out.println("Original tree set: " + t_set);
	    System.out.println("Size of the tree set: " + t_set.size());
		
		/* Write a Java program to compare two tree sets*/
		System.out.println("\n.8. Write a Java program to compare two tree sets.");
		
		// Create a empty tree set
        TreeSet<String> t_set1 = new TreeSet<String>();
     // use add() method to add values in the tree set
          t_set1.add("Red");
          t_set1.add("Green");
          t_set1.add("Black");
          t_set1.add("White");
          System.out.println("Free Tree set: "+t_set1);

          TreeSet<String> t_set2 = new TreeSet<String>();
          t_set2.add("Red");
          t_set2.add("Pink");
          t_set2.add("Black");
          t_set2.add("Orange");
          System.out.println("Second Tree set: "+t_set2);
          //comparison output in tree set
          
         for (String element : t_set1){
             System.out.println(t_set2.contains(element) ? "Yes" : "No");
          }      
		
		 /*Write a Java program to find the numbers less than 7 in a tree set.*/
		System.out.println("\n.9. Write a Java program to find the numbers less than 7 in a tree set.");
		
		// creating TreeSet 
		   TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		     
		   // Add numbers in the tree
		   tree_num.add(1);
		   tree_num.add(2);
		   tree_num.add(3);
		   tree_num.add(5);
		   tree_num.add(6);
		   tree_num.add(7);
		   tree_num.add(8);
		   tree_num.add(9);
		   tree_num.add(10);
		     
		   // Find numbers less than 7
		 treeheadset = (TreeSet)tree_num.headSet(7);  

		   // create an iterator
		/*
		 * Iterator iterator; iterator = treeheadset.iterator();
		 */
		    // set Iterator
		   Iterator<Integer> p = treeheadset.iterator();
		     
		   //Displaying the tree set data
		   System.out.println("Tree set data: ");     
		   while (p.hasNext()){
		   System.out.println(p.next() + " ");
		   }
		
		 /*Write a Java program to get the element in a tree set which is greater than or equal to the given element.*/
		System.out.println("\n.10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.");
		
		System.out.println("Greater than or equal to 4 : "+tree_num.ceiling(4));
		   System.out.println("Greater than or equal to 6 : "+tree_num.ceiling(6));
		
		 /*Write a Java program to get the element in a tree set which is less than or equal to the given element*/
		System.out.println("\n.11. Write a Java program to get the element in a tree set which is less than or equal to the given element");
		
		System.out.println("Less than or equal to 4 : "+tree_num.floor(4));
		   System.out.println("Less than or equal to 29 : "+tree_num.floor(29));
		
		/*
		 * Write a Java program to get the element in a tree set which is strictly
		 * greater than or equal to the given element
		 */
		System.out.println("\n.12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.");
		
		System.out.println("Strictly greater than 1 : "+tree_num.higher(1));
		   System.out.println("Strictly greater than 2 : "+tree_num.higher(2));
		
		/*
		 * Write a Java program to get an element in a tree set which is strictly less
		 * than the given element.
		 */
		System.out.println("\n.13. Write a Java program to get an element in a tree set which is strictly less than the given element.");
		
		System.out.println("Strictly less than 7 : "+tree_num.lower(7));
		   System.out.println("Strictly less than 12 : "+tree_num.lower(12));
		
		/*Write a Java program to retrieve and remove the first element of a tree set.*/
		System.out.println("\n.14. Write a Java program to retrieve and remove the first element of a tree set.");
		
		System.out.println("Original tree set: "+tree_num);
		   System.out.println("Removes the first(lowest) element: "+tree_num.pollFirst());
		   System.out.println("Tree set after removing first element: "+tree_num);
		
		/*Write a Java program to retrieve and remove the last element of a tree set.*/
		System.out.println("\n.15. Write a Java program to retrieve and remove the last element of a tree set.");
		
		System.out.println("Original tree set: "+tree_num);
		   System.out.println("Removes the last element: "+tree_num.pollLast());
		   System.out.println("Tree set after removing last element: "+tree_num);
		
		/*Write a Java program to remove a given element from a tree set.*/
        System.out.println("\n.16. Write a Java program to remove a given element from a tree set.");
        
        System.out.println("Original tree set: "+tree_num);
        System.out.println("Removes 70 from the list: "+tree_num.remove(70));
        System.out.println("Removes 7 from the list: "+tree_num.remove(7));
        System.out.println("Tree set after removing last element: "+tree_num);
	}

}
