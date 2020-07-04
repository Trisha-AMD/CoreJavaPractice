package AllString;

public class StringDefinition
{

	public static void main(String[] args) {
		
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'}; //converting char array to string  
		String s=new String(ch);       
		
		System.out.println(s);
		
		String s1=new String("Welcome");//creating java string by new keyword 
		System.out.println(s1);
		
		String s2 = "Vimal is a good boy \n isnt it?";//creating string by java string literal 
		System.out.println(s2);
		
		/*IMMUTABILITY- In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
                        Once string object is created its data or state can't be changed but a new string object is created.
                EG: https://www.javatpoint.com/immutable-string
*/		
		  String sName="Sachin";  
		   sName.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(sName);//will print Sachin because strings are immutable objects  
		   sName=sName.concat("Tendulkar");//if we explicitly assign it to the reference variable, it will refer to "Sachin Tendulkar" object
		   System.out.println(sName);	//sName points to the "Sachin Tendulkar". Please notice that still sachin object is not modified.
	}  
	
	}
	

