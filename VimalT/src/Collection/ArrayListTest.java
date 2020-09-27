package Collection;
import java.util.*;
public class ArrayListTest {
	public static void main(String[] args) {  
		List<String> list_Strings = new ArrayList<String>();
		
		/*
		 * Write a Java program to create a new array list, add some elements (string)
		 * and print out the collection.
		 */
		System.out.println( "\n1. Write a Java program to create a new array list, add some colors (string) and print out the collection");
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println(list_Strings);
		  
		/* Write a Java program to iterate through all elements in a array list. */
		  System.out.println( "\n2. Write a Java program to iterate through all elements in a array list");
		  for (String element : list_Strings) 
			    System.out.println(element);
		  
		/*
		 * Write a Java program to insert an element into the array list at the first
		 * position.
		 */
		  System.out.println( "\n3. Write a Java program to insert an element into the array list at the first position");
		// Now insert a color at the first and last position of the list
		  list_Strings.add(0, "Pink");
		  list_Strings.add(5, "Yellow");
		  // Print the list
		  System.out.println(list_Strings);
		  
		/*
		 * Write a Java program to retrieve an element (at a specified index) from a
		 * given array list.
		 */
		  System.out.println( "\n4. Write a Java program to retrieve an element (at a specified index) from a given array list.");
		// Retrive the first and third element
		  String element = list_Strings.get(0);
		  System.out.println("First element: "+element);
		  element = list_Strings.get(2);
		  System.out.println("Third element: "+element);
		  
		/* Write a Java program to update specific array element by given element. */
		  System.out.println( "\n5. Write a Java program to update specific array element by given element.");
		  list_Strings.set(2, "Yellow");
		   // Print the list again
		  System.out.println(list_Strings);
		  
/* Write a Java program to remove the third element from a array list. */
		  System.out.println( "\n6. Write a Java program to remove the third element from a array list");
		  list_Strings.remove(2);
		  // Print the list again
		  System.out.println("After removing third element from the list:\n"+list_Strings);
		  
		/* Write a Java program to search an element in a array list. */
		  
		  System.out.println( "\n7. Write a Java program to search an element in a array list. ");
		    if (list_Strings.contains("Red")) {
		        System.out.println("Found the element");
		        } else {
		        System.out.println("There is no such element");
		        }
		  
			/* Write a Java program to sort a given array list. */
		    System.out.println( "\n8. Write a Java program to sort a given array list. ");
		        System.out.println("List before sort: "+list_Strings);
		        Collections.sort(list_Strings);
		        System.out.println("List after sort: "+list_Strings); 
		    
		/* Write a Java program to copy one array list into another. */
		        System.out.println( "\n9. Write a Java program to copy one array list into another.");
		        List<String> List1 = new ArrayList<String>();
		        List1.add("1");
		        List1.add("2");
		        List1.add("3");
		        List1.add("4");
		        System.out.println("List1: " + List1);
		        List<String> List2 = new ArrayList<String>();
		        List2.add("A");
		        List2.add("B");
		        List2.add("C");
		        List2.add("D");
		        System.out.println("List2: " + List2);
		        // Copy List2 to List1
		        Collections.copy(List1, List2);
		        System.out.println("Copy List to List2,\nAfter copy:");
		        System.out.println("List1: " + List1);
		        System.out.println("List2: " + List2);
		      
		/* Write a Java program to shuffle elements in a array list */
		        System.out.println( "\n10. Write a Java program to shuffle elements in a array list.");
		        System.out.println("List before shuffling:\n" + list_Strings);  
		        Collections.shuffle(list_Strings);
		        System.out.println("List after shuffling:\n" + list_Strings);    
		        
		/* Write a Java program to reverse elements in a array list */ 
		        System.out.println( "\n11. Write a Java program to reverse elements in a array list");
		        System.out.println("List before reversing :\n" + list_Strings);  
		        Collections.reverse(list_Strings);
		        System.out.println("List after reversing :\n" + list_Strings); 
		        
		/* Write a Java program to extract a portion of a array list. */
		        System.out.println( "\n12. Write a Java program to extract a portion of a array list.");
		        System.out.println("Original list: " + list_Strings);
		        List<String> sub_List = list_Strings.subList(0, 3);
		        System.out.println("List of first three elements: " + sub_List);
		        
		/* Write a Java program to compare two array lists. */
		        System.out.println( "\n13. Write a Java program to compare two array lists.");
		        ArrayList<String> c1= new ArrayList<String>();
		          c1.add("Red");
		          c1.add("Green");
		          c1.add("Black");
		          c1.add("White");
		          c1.add("Pink");

		          ArrayList<String> c2= new ArrayList<String>();
		          c2.add("Red");
		          c2.add("Green");
		          c2.add("Black");
		          c2.add("Pink");

		          //Storing the comparison output in ArrayList<String>
		          ArrayList<String> c3 = new ArrayList<String>();
		          for (String e : c1)
		             c3.add(c2.contains(e) ? "Yes" : "No");
		          System.out.println(c3);
		        
		/* Write a Java program of swap two elements in an array list. */
		          System.out.println( "\n14. Write a Java program of swap two elements in an array list.");
		          //Swapping 1st(index 0) element with the 3rd(index 2) element
		          Collections.swap(c1, 0, 2);
		           System.out.println("Array list after swap:");
		           for(String b: c1){
		           System.out.println(b);
		           }
		           
		/* Write a Java program to join two array lists. */
		           System.out.println( "\n15. Write a Java program to join two array lists");
		        // Let join above two list
		           ArrayList<String> a = new ArrayList<String>();
		           a.addAll(c1);
		           a.addAll(c2);
		           System.out.println("New array: " + a);  
		           
		/* Write a Java program to clone an array list to another array list. */
		           System.out.println( "\n16. Write a Java program to clone an array list to another array list.");
		           System.out.println("Original array list: " + c1);
		           ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
		           System.out.println("Cloned array list: " + newc1);       
		          
		/* Write a Java program to empty an array list. */
		           System.out.println( "\n17. Write a Java program to empty an array list");
		           System.out.println( "");
		           System.out.println("Original array list: " + c1);
		           c1.removeAll(c1);
		           System.out.println("Array list after remove all elements "+c1); 
		           
		/* Write a Java program to test an array list is empty or not. */
		           
		           System.out.println( "\n18. Write a Java program to test an array list is empty or not");
		           System.out.println("Array list after remove all elements "+c1);   
		           System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
		      
		/*
		 * Write a Java program to trim the capacity of an array list the current list
		 * size
		 */
		           System.out.println( "\n19. Write a Java program to trim the capacity of an array list the current list size");
		           System.out.println("Original array list: " + newc1);
		           System.out.println("Let trim to size the above array: ");
		           newc1.trimToSize();
		           System.out.println(newc1);
		           
		/* Write a Java program to increase the size of an array list. */
		           System.out.println( "\n20. Write a Java program to increase the size of an array list.");
		           ArrayList<String> d1= new ArrayList<String>(3);
		           d1.add("Red");
		           d1.add("Green");
		           d1.add("Black");
		           System.out.println("Original array list: " + d1);
		           //Increase capacity to 6
		           d1.ensureCapacity(6);
		           d1.add("White");
		           d1.add("Pink");
		           d1.add("Yellow");
		           System.out.println("New array list: " + d1);
		      
		/*
		 * Write a Java program to replace the second element of a ArrayList with the
		 * specified element.
		 */
		           System.out.println( "\n21. Write a Java program to replace the second element of a ArrayList with the specified element.");
		           ArrayList<String>  color = new ArrayList<String>();

		           color.add("Red");
		           color.add("Green");

		           System.out.println("Original array list: " + color);
		           String new_color = "White";
		           color.set(1,new_color);

		           int num=color.size();
		           System.out.println("Replace second element with 'White'."); 
		           for(int i=0;i<num;i++)
		           System.out.println(color.get(i));   
		           
		/*
		 * Write a Java program to print all the elements of a ArrayList using the
		 * position of the elements
		 */
		           System.out.println( "\n22. Write a Java program to print all the elements of a ArrayList using the position of the elements");
		           System.out.println("\nOriginal array list: " + newc1);
		           System.out.println("\nPrint using index of an element: ");
		           int no_of_elements = newc1.size();
		           for (int index = 0; index < no_of_elements; index++)
		            System.out.println(newc1.get(index));   
}

	}
	