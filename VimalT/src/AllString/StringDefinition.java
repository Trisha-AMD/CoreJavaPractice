package AllString;

public class StringDefinition
{

	public static void main(String[] args) {
		
		
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
	}

}
