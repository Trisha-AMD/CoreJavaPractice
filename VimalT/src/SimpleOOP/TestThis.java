package SimpleOOP;

public class TestThis {
	
	//2. Using this() to invoke current class constructor

	// Java code for using this() to  
	// invoke current class constructor  
	    int a; 
	    int b; 
	  
	    //Default constructor 
	    TestThis() 
	    {   
	        this(10, 20); 
	        System.out.println("Inside  default constructor \n"); 
	    } 
	      
	    //Parameterized constructor 
	    TestThis(int a, int b) 
	    { 
	        this.a = a; 
	        this.b = b; 
	        System.out.println("Inside parameterized constructor"+ a+ ","+b); 
	    } 
	    
	  
	    public static void main(String[] args) 
	    { 
	       //TestThis object = new TestThis(); 
	        new TestThis(); 
	        //object.get().display();
	    } 
	    


}
