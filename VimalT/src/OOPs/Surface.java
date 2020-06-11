package OOPs;

public class Surface extends Employee implements Rectangle{
	
	public void hra()
	{
		System.out.println("hra");
	}
	
	public void area(int a, int b) {
		System.out.println("Area"+a*b);
	}

}