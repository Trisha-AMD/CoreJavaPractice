package AllString;

public class BufferBuilderMethods {

	public static void main(String[] args) {
		
		/*
		 * final int NUM = 7;
		 * 
		 * String acNo = new String("4489-7710-6528-7451");
		 * System.out.println("Account Number = "+acNo);
		 * 
		 * String acNos = (String)acNo; String ac[] = acNo.split("-");
		 * 
		 * StringBuilder sb4 = new StringBuilder();
		 * 
		 * sb4.append("Cost Center");
		 */
		
		//append(String s)
        System.out.println("-------------------append()------------------");
        StringBuffer sb= new StringBuffer("Sachin");  
		sb.append(" Tendulkar");//concat() method appends the string at the end  
		System.out.println(sb);//will print Sachin Tendulkar because stringsBuffer are mutable objects 
	    sb = sb.append(" Tendulkar");
		System.out.println(sb); //prints Sachin Tendulkar Tendulkar
	
		
		//insert(int offset, String s)
		System.out.println("-------------------insert()------------------");
		StringBuffer sb1= new StringBuffer("Sangakara");
		sb.insert(2, "Kumaarr");
		System.out.println(sb); 
		sb.insert(4, sb1);
		System.out.println(sb);
		
		//replace(int startIndex, int endIndex, String str)
		System.out.println("-------------------replace()------------------");
		String s1 = "Rohit";
		System.out.println(sb);
		sb.replace(0, 12, s1);
		System.out.println(sb);
		
		//delete(int startIndex, int endIndex)
		System.out.println("-------------------delete()------------------");
		sb.delete(20, 28);
		System.out.println(sb);
		
		//reverse()
		System.out.println("-------------------reverse()------------------");
		sb.reverse();
		System.out.println(sb);
		
		//capacity()
		System.out.println("-------------------capacity()------------------");
		int cap = sb.capacity();
		System.out.println("Capacity of String = "+cap);
		
		StringBuffer sb2=new StringBuffer();  
		System.out.println(sb2.capacity());//default 16  
		sb2.append("Hello");
		System.out.println(sb2);
		System.out.println(sb2.capacity());//now 16  
		sb2.append("java is my favourite language");
		System.out.println(sb2.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
		String h = "Vimal";
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
