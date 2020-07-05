package AllString;

public class StringDefinition
{

	public static void main(String[] args) {
		
		System.out.println("-------------------String class------------------");
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'}; //converting char array to string  
		String s=new String(ch);       
		
		System.out.println(s);
		
		String s1=new String("Welcome");//creating java string by new keyword 
		System.out.println(s1);
		
		String s2 = "Vimal is a good boy \n to him";//creating string by java string literal 
		System.out.println(s2);
		
		//Immutable String example
		String sName="Sachin";  
		sName.concat(" Tendulkar");//concat() method appends the string at the end  
		System.out.println(sName);//will print Sachin because strings are immutable objects 
		sName = sName.concat(" Tendulkar");
		System.out.println(sName);//if we explicitly assign it to the reference variable, it will refer to "Sachin Tendulkar"
	
		System.out.println("-------------------String Buffer------------------");
	  
		/*
		 * Java StringBuffer class is used to create mutable (modifiable) string. The
		 * StringBuffer class in java is same as String class except it is mutable i.e.
		 * it can be changed.
		 * StringBuffer is synchronized i.e. thread safe. 
		 * It means two threads can't call the methods of StringBuffer simultaneously.
		 * StringBuffer is less efficient than StringBuilder.
		 */
		
		StringBuffer sb= new StringBuffer("Sachin");  
		sb.append(" Tendulkar");//concat() method appends the string at the end  
		System.out.println(sb);//will print Sachin Tendulkar because stringsBuffer are mutable objects 
	    sb = sb.append(" Tendulkar");
		System.out.println(sb); //prints Sachin Tendulkar Tendulkar
	
	
		System.out.println("-------------------String Builder------------------");
	    
		/*
		 * Java StringBuilder class is used to create mutable (modifiable) string. The
		 * Java StringBuilder class is same as StringBuffer class except that it is
		 * non-synchronized. It is available since JDK 1.5.
		 * StringBuilder is non-synchronized i.e. not thread safe. 
		 * It means two threads can call the methods of StringBuilder simultaneously.
		 * 	StringBuilder is more efficient than StringBuffer.
		 */
		
		StringBuilder sb1= new StringBuilder("Saurav");  
		sb1.append(" Ganguly");//concat() method appends the string at the end  
		System.out.println(sb1);//will print Saurav Ganguly because stringsBuffer are mutable objects 
	    sb1 = sb1.append(" Ganguly");
		System.out.println(sb1); //prints Saurav Ganguly Ganguly
		
	}

}
