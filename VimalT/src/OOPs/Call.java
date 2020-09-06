package OOPs;

public class Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic A = new Arithmetic();
		A.Sum(5, 4.897);
		
		InherOne I1 = new InherOne();
		I1.display();
		
		InherTwo I2 = new InherTwo();
		I2.display();
		I2.output();
		
		InherThree I3 = new InherThree();
		I3.display();
		
		System.out.println(I3.add(4, 5));
		
		System.out.println(I3.add(56.77, 89.56));
		
		System.out.println(I3);
		
		Employee test = new Surface();
		
		test.hra();
		test.salary();
		
		Rectangle test2 = new Surface();
		test2.area(2,7);
	}

	@Override
	public String toString() {
		return "Call [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
