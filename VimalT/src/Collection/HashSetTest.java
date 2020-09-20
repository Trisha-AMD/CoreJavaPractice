package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class HashSetTest {

	public static void main(String[] args)
	{
		/*
		 * Write a Java program to append the specified element to the end of a hash
		 * set.
		 */
		System.out.println("\n1. Write a Java program to append the specified element to the end of a hash set.");
		// Create a empty hash set
	     HashSet<String> h_set = new HashSet<String>();
	   // use add() method to add values in the hash set
	          h_set.add("Red");
	          h_set.add("Green");
	          h_set.add("Black");
	          h_set.add("White");
	          h_set.add("Pink");
	          h_set.add("Yellow");

	   // print the hash set
	   System.out.println("The Hash Set: " + h_set);

	
	/* Write a Java program to iterate through all elements in a hash list */
	   
		System.out.println("\n2. Write a Java program to iterate through all elements in a hash list ");
		
		// set Iterator 
	    Iterator<String> p = h_set.iterator();
	  // Iterate the hash set
	   while (p.hasNext()) {
	   System.out.println(p.next());
	   }
	   
		/* Write a Java program to get the number of elements in a hash set. */
	   System.out.println("\n3. Write a Java program to get the number of elements in a hash set ");
	   
	   System.out.println("Original Hash Set: " + h_set);
	    System.out.println("Size of the Hash Set: " + h_set.size());
	   
		/* Write a Java program to empty an hash set. */
	    
	    System.out.println("\n4. Write a Java program to empty an hash set.");
	    
	    System.out.println("Original Hash Set: " + h_set);
	    // Remove all elements
	    h_set.removeAll(h_set);
	    System.out.println("Hash Set after removing all the elements "+h_set); 
	    
	    /* Write a Java program to remove all of the elements from a hash set. */
        System.out.println("\n 12. Write a Java program to remove all of the elements from a hash set.");
        
        // Create a empty hash set
        HashSet<String> h_set3 = new HashSet<String>();
     // use add() method to add values in the hash set
          h_set3.add("Red");
          h_set3.add("Green");
          h_set3.add("Black");
          h_set3.add("White");
           System.out.println("Original hash set contains: "+ h_set3);
      //  clear() method removes all the elements from a hash set
      // and the set becomes empty.
          h_set3.clear();
 
     // Display original hash set content again
          System.out.println("HashSet content: "+h_set3);
	    
	    
	    
		/* Write a Java program to test a hash set is empty or not. */
	    System.out.println("\n5. Write a Java program to test a hash set is empty or not.");
	     
	    h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
	    System.out.println("Original Hash Set: " + h_set);
	    System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
	    System.out.println("Remove all the elements from a Hash Set: ");
	    h_set.removeAll(h_set);
	    System.out.println("Hash Set after removing all the elements "+h_set);  
	    System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
	    
		/* Write a Java program to clone a hash set to another hash set. */
	    System.out.println("\n6. Write a Java program to clone a hash set to another hash set.");
	 // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);
        HashSet <String> new_h_set = new HashSet <String> ();
        new_h_set = (HashSet)h_set.clone();
        System.out.println("Cloned Hash Set: " + new_h_set);
        
		/* Write a Java program to convert a hash set to an array. */
        System.out.println("\n7. Write a Java program to convert a hash set to an array.");
        
        System.out.println("Original Hash Set: " + h_set);
        // Creating an Array
        String[] new_array = new String[h_set.size()]; //String is a Character array
        h_set.toArray(new_array);
   
       // Displaying Array elements
       System.out.println("Array elements: ");
        for(String element : new_array){
          System.out.println(element);
        }
        
		/* Write a Java program to convert a hash set to a tree set. */
        System.out.println("\n8. Write a Java program to convert a hash set to a tree set.");
        
     // Create a empty hash set
        HashSet<String> h_set1 = new HashSet<String>();
      // use add() method to add values in the hash set
             h_set1.add("Cyan");
             h_set1.add("Pink");
             h_set1.add("Black");
             h_set1.add("Maroon");
             h_set1.add("Indigo");
             h_set1.add("Turquoise");
         System.out.println("Original Hash Set: " + h_set1);
       
        // Creat a TreeSet of HashSet elements
        Set<String> tree_set = new TreeSet<String>(h_set1);
    
        // Display TreeSet elements
        System.out.println("TreeSet elements: ");
        for(String element : tree_set){
           System.out.println(element);
        }
        
		/* Write a Java program to convert a hash set to a List/ArrayList. */
        System.out.println("\n9. Write a Java program to convert a hash set to a List/ArrayList.");
        
        System.out.println("Original Hash Set: " + h_set1);
        
        // Create a List from HashSet elements
         List<String> list = new ArrayList<String>(h_set1);
     
         // Display ArrayList elements
         System.out.println("ArrayList contains: "+ list);
        
		/* Write a Java program to compare two hash sets. */
         System.out.println("\n10. Write a Java program to compare two hash sets..");
       //comparison output in hash set
        
        for (String element : h_set){
            System.out.println(h_set1.contains(element) ? "Yes" : "No");
         } 
         
		/*
		 * Write a Java program to compare two sets and retain elements which are same
		 * on both sets.
		 */
        System.out.println("\n11. Write a Java program to compare two sets and retain elements which are same on both sets.");
        h_set.retainAll(h_set1);
        System.out.println("HashSet content:");
        System.out.println(h_set1);
        
		
        
	}
}
