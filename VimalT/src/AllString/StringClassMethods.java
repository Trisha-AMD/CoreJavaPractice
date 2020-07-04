package AllString;

public class StringClassMethods {

	public static void main(String[] args) {
	
		//valueOf()
		System.out.println("-------------------valueOf()------------------");
		boolean b1=true;  
        byte b2=11;    
        short sh = 12;  
        int i = 13;  
        long l = 14L;  
        float f = 15.5f;  
        double d = 16.5d;  
        char chr[]={'j','a','v','a'};  
        StringClassMethods obj=new StringClassMethods();  
        System.out.println(String.valueOf(b1));  
        System.out.println(String.valueOf(b2));  
        System.out.println(String.valueOf(sh));  
        System.out.println(String.valueOf(i));  
        System.out.println(String.valueOf(l));  
        System.out.println(String.valueOf(f));  
        System.out.println(String.valueOf(d));  
        System.out.println(String.valueOf(chr));  
        System.out.println(String.valueOf(obj)); 

        //trim()
        System.out.println("-------------------trim()------------------");
        String s1="  hello string   ";  
        System.out.println(s1+"Welcome");//without trim()  
        System.out.println(s1.trim()+"Welcome");//with trim()  
        
        //toUpper()
        System.out.println("-------------------toUpper()------------------");
        String sUpper=s1.toUpperCase();  
        System.out.println(sUpper);
        
        //toLower()
        System.out.println("-------------------toLower()------------------");
        String s2="JAVATPOINT HELLO stRIng";  
        String sLower=s2.toLowerCase();  
        System.out.println(sLower);  
        
        //indexOf()
        System.out.println("-------------------indexOf()------------------");
        String s3="India's finest Ultra White paper";  
        System.out.println(s3);
        
        //passing substring  
        int index1=s3.indexOf("finest");  
        int index2=s3.indexOf("ite"); 
        System.out.println("Index of finest is "+index1+"  "+"Index of ite is "+index2); 
        //passing substring with from index  
        int index3=s3.indexOf("Ultra",4);//returns the index of Ultra substring after 4th index  
        System.out.println("Index of Ultra is "+index3);
        //passing char value  
        int index4=s3.indexOf('a');//returns the index of a char value  
        System.out.println("Index of first letter a is "+index4);
        //passing char value with from index
        int index5=s3.indexOf('a', 5);//returns the index of a char value  
        System.out.println("Index of first letter a after 5 characters is "+index5);
        //when substring or character is not present in the string
        int index6=s3.indexOf('z');  
        System.out.println("Index of first letter z is "+index6);
        int index7=s3.indexOf("ultra",4);  
        System.out.println("Index of ultra is "+index7);
        
        //split()
        System.out.println("-------------------split()------------------");
        String s4="you can call me at 5 pm";
        String[] words=s4.split("\\s");//splits the string based on whitespace  
        //using java foreach loop to print elements of string array  
        for(String w:words){  
        System.out.println(w);  
        
        String s5="This is an amazing thought";  
        /*System.out.println("0returning words:");  
        for(String w1:s5.split("\\s",0)){  
        System.out.println(w1);  
        }  
        System.out.println("1returning words:");  
        for(String w2:s5.split("\\s",1)){  
        System.out.println(w2);  
        }*/
        System.out.println("2returning words:");  
        for(String w3:s5.split("\\s",2)){  
        System.out.println(w3);  
        }
        }
        
        
		/*System.out.println(s2.indexOf("\n"));
		
		System.out.println(s1+"\r\n");
		
		
//		char f = s1.charAt(3);
//		System.out.println(f);
//		int l = s2.length();
//		System.out.println(l);
		
		String sb1=s2.substring(7,9);   //(beginindex,end index)
		System.out.println(sb1);
		
		String sb2=s2.substring(7);   //(beginindex,end index)
		System.out.println(sb2);
		
		boolean t = s2.contains("Vimal"); //it is case - sensitive
		System.out.println(t);
		
		String j = String.join(";", s2,s);
		System.out.println(j);
		
		boolean t2 = s2.equals(j);
		System.out.println(t2);
		
		String e = "";
		boolean c= e.isEmpty();
		System.out.println(c);
		
		String g = s1.concat(s2);
		System.out.println(g);
		
		String h = s2.replace("i", "o");
		System.out.println(h);
		
		
		String sb3="java string split method by javatpoint";  
		String[] words=sb3.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		
		
		
		}  
		StringBuilder sb=new StringBuilder("Hello "); 
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//printsHello Java  
		
		String acName = "1233-090-989";
	
	    if(acName!=null) {
	    String [] ac = acName.split("-");
	   // sb.append(formatXMLElement(COST_CENTER_TAG, ac[1], indent+1));
	    //sb.append(formatXMLElement(GL_ACCOUNT_TAG, ac[0], indent+1));
	    for(String a:ac)
	    {
	    	System.out.println(a);
	}
*/		
	}

}
