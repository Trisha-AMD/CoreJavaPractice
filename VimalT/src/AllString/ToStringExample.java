package AllString;

public class ToStringExample {
	
	int id;
	String name;
	String city;
	
	ToStringExample(int id, String name, String city)
	{
	this.id=id;
	this.name=name;
	this.city=city;
	}
	
	void Display()
	{
		System.out.println("ID="+id+"Name="+name+"City="+city);
	}
	
	/*
	 * If you want to represent any object as a string, toString() method comes into
	 * existence.
	 * 
	 * The toString() method returns the string representation of the object.
	 * 
	 * If you print any object, java compiler internally invokes the toString()
	 * method on the object. So overriding the toString() method, returns the
	 * desired output, it can be the state of an object etc. depends on your
	 * implementation.
	 */
	
	public String toString()
	{//overriding the toString() method
	return id+" "+name;
	
	
	}
	public static void main(String args[]){
	ToStringExample e1=new ToStringExample(01,"Ari","NewYork");
	ToStringExample e2=new ToStringExample(02,"Jon","Chicago");
	e1.Display();
	e2.Display();
	System.out.println(e1);
	System.out.println(e2);
	
	}
}


