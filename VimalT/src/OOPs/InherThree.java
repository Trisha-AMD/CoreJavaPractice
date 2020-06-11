package OOPs;

public class InherThree extends InherOne {
	public void display() {
		System.out.println("Class 2");
	}
	
	//Why is it calling the display function of the present class?
	/*Answer :  If there is no display function in the present class, it will call the display function 
	 * from the parent class*/
	
	
	int i,j;
	
	public int add (int x, int y) {
		return x+y;
	}
	
	public double add (double x, double y) {
		return x+y;
	}

}
