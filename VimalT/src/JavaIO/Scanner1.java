package JavaIO;

import java.util.*;
import java.io.InputStreamReader;

public class Scanner1 
{
static float b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int a = sc.nextInt();
		b = sc.nextFloat();
		String str = sc.next();
		System.out.println("Number1 = "+ a);
		System.out.println("Number2 = "+ b);
		System.out.println("Sentence = "+ str);
		
	}		
	}
		
