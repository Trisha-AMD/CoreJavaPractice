package SimpleOOP;

public class ConstructorEG {

		
		ConstructorEG (int x, int y) {
			System.out.println("Sum " + (x+y));
		}
		
		ConstructorEG (double x, double y) {
			System.out.println("Sum " + (x+y));
		}
		
		ConstructorEG () {
		
			
			this(40,50);          //invoking current class constructor using this keyword
			System.out.println("One");
			

		}
		
void Display()
{
	System.out.println("trisha");
}


	
public static void main(String args[]) {
	new ConstructorEG(1,2);
	
	//ConstructorEG C1 = new ConstructorEG(1,2);
	ConstructorEG C2 = new ConstructorEG(22.10, 16.34);
	new ConstructorEG ();
	C2.Display();
	
	//Constructor overriding is not possible in java
}

}

