package SimpleOOP;

class ABC{  
	   private double num = 100;
	   private int square(int a){
		return a*a;
	   }
	}  
	public class PrivateEG{
	   public static void main(String args[]){  
		ABC obj = new ABC();  
		System.out.println(obj.num); //getter and setter methods can be used to access the num variable and the square method
		System.out.println(obj.square(10));
	   }  
	}