package AllString;

public class StringMethods {
	
	
	public static void main(String[] args) {
		
		//Comparison
		
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav"; 
		   String s5="SACHIN";
		   String s6="Ratan";
		   
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   System.out.println(s1.equals(s5));//false 
		   System.out.println(s1.equalsIgnoreCase(s5));//true
		   
		   System.out.println(s1.compareTo(s3));//0  
		   System.out.println(s1.compareTo(s6));//1(because s1>s3)  
		   System.out.println(s6.compareTo(s1));//-1(because s3 < s1 
		   System.out.println(s1.compareTo(s5));
		   System.out.println(s1.compareToIgnoreCase(s5));//0
		   
		   
		   //Concat
		   
		       String s7="java string";  
			   s7.concat("is immutable");  
			   System.out.println(s7);  
			   s7=s7.concat(" is immutable so assign it explicitly");  
			   System.out.println(s7);  
			   
			   String s8 = s1.concat(s5).concat(s7);  
			   System.out.println(s8); 
			   
			   s1.concat(s5).concat(s7);  
			   System.out.println(s1);// Prints Sachin
			   
	      //Substring
			// s7= java string is immutable so assign it explicitly
			   System.out.println(s7.substring(6));
			   System.out.println(s7.substring(0,6));
	
	
	}
	
		   
	}


