package AllString;

public class StringDefinition
{

	public static void main(String[] args) {
		
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'}; //converting char array to string  
		String s=new String(ch);       
		
		System.out.println(s);
		
		String s1=new String("Welcome");//creating java string by new keyword 
		System.out.println(s1);
		
		String s2 = "Vimal is a good boy";//creating string by java string literal 
		System.out.println(s2);
		
//		char f = s1.charAt(3);
//		System.out.println(f);
//		int l = s2.length();
//		System.out.println(l);
		
		/*String sb1=s2.substring(7,9);   //(beginindex,end index)
		System.out.println(sb1);
		
		String sb2=s2.substring(7);   //(beginindex,end index)
		System.out.println(sb2);*/
		
		/*boolean t = s2.contains("Vimal"); //it is case - sensitive
		System.out.println(t);*/
		
		/*String j = String.join(";", s2,s);
		System.out.println(j);
		
		boolean t2 = s2.equals(j);
		System.out.println(t2);*/
		/*
		String e = "";
		boolean c= e.isEmpty();
		System.out.println(c);
		
		String g = s1.concat(s2);
		System.out.println(g);*/
		
		String h = s2.replace("i", "o");
		System.out.println(h);
	}

}
