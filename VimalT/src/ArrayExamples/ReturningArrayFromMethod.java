package ArrayExamples;

//Java Program to return an array from the method  

public class ReturningArrayFromMethod {

	 //creating method which returns an array  
	static int[] get(){  
	return new int[]{10,30,50,90,60}; 
	}  
	  
	static int fetch() {
		return 45;
	}
	
	public static void main(String args[]){  
	//calling method which returns an array  
	int[] arr=get();  
	//printing the values of an array  
	for(int i=0;i<arr.length;i++)  
	System.out.println(arr[i]);  
	
	int num=fetch();
	System.out.println(num);
	}
	
	
	
}
