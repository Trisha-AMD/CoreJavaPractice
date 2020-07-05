package AllString;

public class StringMethods {
	
	
	public static void main(String[] args) {
		
		//Comparison
		
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav"; 
		   String s5="SACHIN";
		   String s6="Qatan";
		   
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   System.out.println(s1.equals(s5));//false 
		   System.out.println(s1.equalsIgnoreCase(s5));//true
		   
		   System.out.println(s1.compareTo(s3));//0  
		   System.out.println(s1.compareTo(s6));//2
		   System.out.println(s6.compareTo(s1));//-2
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
			   System.out.println("-------------------substring()------------------");
			   System.out.println(s7.substring(6));
			   System.out.println(s7.substring(0,6));
	
	    //CharAt()
			   System.out.println("-------------------CharAt()------------------");
			   char f = s1.charAt(3);
        	   System.out.println(f);
			   
        	 //indexOf()
               System.out.println("-------------------indexOf()------------------");
               String s10="India's finest Ultra Trisha's smart phone in a phone";  
               System.out.println(s10);
               
             //passing char value  indexOf(ch)
               int index4=s10.indexOf('a');//returns the index of a char value  
               System.out.println("Index of first letter a is "+index4);
               
             //passing char value with from index  indexOf(int ch, int fromIndex)
               int index5=s10.indexOf('a', 5);//returns the index of a char value after 5 char
               System.out.println("Index of first letter a after 5 characters is "+index5);
               
               //passing substring indexOf(String substring) 
               int index1=s10.indexOf("finest");  
               int index2=s10.indexOf("sha"); 
               System.out.println("Index of finest is "+index1+"\n"+"Index of sha is "+index2); 
               
               //passing substring with from index  indexOf(String substring, int fromIndex)
               int index3=s10.indexOf("Ultra",4);//returns the index of Ultra substring after 4th index  
               System.out.println("Index of Ultra is "+index3);
               
               
               //when substring or character is not present in the string
               int index6=s10.indexOf('z');  
               System.out.println("Index of first letter z is "+index6);
               int index7=s10.indexOf("ultra",4);  
               System.out.println("Index of ultra is "+index7);
        	   
               //lastIndexOf()
               System.out.println("Last Index=" + s10.lastIndexOf("phone"));
               System.out.println("Last Index of a in " + s10 + " = " + s10.lastIndexOf('a'));
        	   
               //length
               System.out.println("-------------------length()------------------");
               int l = s2.length();
        		System.out.println(l);   
			    	
        		//toUpper()
                System.out.println("-------------------toUpper()------------------");
                String sUpper=s1.toUpperCase();  
                System.out.println(sUpper);
                
                //toLower()
                System.out.println("-------------------toLower()------------------");
                String s9="JAVATPOINT HELLO stRIng";  
                String sLower=s9.toLowerCase();  
                System.out.println(sLower);
                
                //trim() Removes white spaces before and after the string
                System.out.println("-------------------trim()------------------");
                String s11="  hello string   ";  
                System.out.println(s11+"Welcome");//without trim()  
                System.out.println(s11.trim()+"Welcome");//with trim() 
                
              //valueOf()
        		System.out.println("-------------------valueOf()------------------");
        		boolean b1=true;  
                byte b2=11;    
                short sh = 12;  
                int i = 13;  
                long lg = 14L;  
                float fl = 15.5f;  
                double d = 16.5d;  
                char chr[]={'j','a','v','a'}; 
               Integer H=10;
               String s13="133";
                StringMethods obj=new StringMethods();  
                System.out.println(String.valueOf(b1));  
                System.out.println(String.valueOf(b2));  
                System.out.println(String.valueOf(sh));  
                System.out.println(String.valueOf(i));  
                System.out.println(String.valueOf(lg));  
                System.out.println(String.valueOf(fl));  
                System.out.println(String.valueOf(d));  
                System.out.println(String.valueOf(chr));  
                System.out.println(String.valueOf(obj)); 
                System.out.println(H.valueOf(s13));
	//split()
                System.out.println("-------------------split()------------------");
                String acNo = "48933-5510-0109-9876";
                String[] ac = acNo.split("-",3);              // String[] split(String regex,int limit)

                
                for(String w:ac){  
            		System.out.println(w); 
            	}
                
                String str = "We're Ridiculously Committed! Welcome"; 
                String[] arrOfStr = str.split(" ");                      //String[] split(String regex)

                 System.out.println("Number of substrings: "+arrOfStr.length);
   
               
                 for(int j=0; j< arrOfStr.length; j++)
                 {
                     System.out.println("str["+j+"] : "+arrOfStr[j]);
                 }
	
                 //contains(CharSequence s)
                 System.out.println("------------------contains()------------------");
                 if(str.contains("We're")) {
                	 System.out.println("Yes");
                 }
                 else
                	 System.out.println(str);
                 boolean b = str.contains("We're");
                 System.out.println(b);
                 
                 //endsWith()
                 System.out.println("------------------endsWith()------------------");
                 b = str.endsWith("i");
                 System.out.println(b);
                 
                 //getChars()
                 System.out.println("------------------getChars()------------------");
                 char sentence[] = new char[25];
                 str.getChars(0, 20, sentence, 5);
                 
                 for (int j=0;j<sentence.length;j++)
                	 System.out.println(sentence[j]);
                 
                 //hashCode()
                 System.out.println("---------------------Hashcode test of String:");  
     	        String st="java";  
     	        System.out.println(st.hashCode());  
     	        str=str+"tpoint";  
     	        System.out.println(st.hashCode());                  //String returns new hashcode value when you concat string but StringBuffer returns same.
     	   
     	        
     	        //isEmpty()
     	       System.out.println("------------------isEmpty()------------------");
     	        b = str.isEmpty();
     	        System.out.println(b);
     	        
     	        
     	        //String replace(char old, char new)
     	       System.out.println("------------------replace()------------------");
     	       System.out.println(str);
     	       System.out.println("Replacing all e with u");
     	       str=str.replace('e', 'u');
     	       System.out.println(str);
     	       
     	       //String replace(CharSequence old, CharSequence new)
     	      System.out.println("------------------replace()------------------");
     	      String you = "all in all";
     	     System.out.println(you);
   	       System.out.println("Replacing all with out");
   	       you=you.replace("all", "out");
   	       System.out.println(you);
   	       
   	       
     	        //startsWith()
   	    System.out.println("------------------startsWith()------------------");
   	    b=str.startsWith("W");
   	    System.out.println(b);
   	    
   	    //subSequence()
   	 System.out.println("------------------subSequence()------------------");
   	String Str = new String("Welcome to Learing String Java Class");

    System.out.print("Return Value :" );
    System.out.println(Str.subSequence(0, 10) );

    System.out.print("Return Value :" );
    System.out.println(Str.subSequence(10, 25) );
    
    	//toCharArray()
    System.out.println("------------------toCharArray()------------------");
     char Sente[] = new char[40];
     Sente=Str.toCharArray();
     for(i=0; i<Sente.length; i++)
     {
    	 System.out.println(Sente[i]);
     }     	        
     	        
     	        								
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
//     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	//        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
     	        
	}
	
	
	
		   
	}



