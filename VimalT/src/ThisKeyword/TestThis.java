package ThisKeyword;

public class TestThis {
	
	//2. this() to invoke current class constructor

	 
	    int a; 
	    int b; 
	  
	    
	    TestThis() //Default constructor 
	    {   
	        this(10, 20);             //Calling parameterized constructor from default constructor
	        System.out.println("Inside  default constructor \n"); 
	    } 
	      
	    
	    TestThis(int a, int b) //Parameterized constructor 
	    { 
	        this.a = a; 
	        this.b = b; 
	        System.out.println("Inside parameterized constructor"+ a+ ","+b); 
	    } 
	    
	    
	 //3. this: to invoke current class method
	    
	     void m()
	     {
	    	 System.out.println("hello m");
	    	 
	     }  
	    
	     void n()
	    {  
	    	 this.m();              //m();//same as this.m()
	    
	    	 System.out.println("hello n");                               
	   
	    }  
	  
	     
	  //4. Example of this keyword that you return as a statement from the method  
	    
	     TestThis get()             //Return type should be class name
	     {
	    	 return this;         
	     }
	    
	     
	    public static void main(String[] args) 
	    { 
	        TestThis object = new TestThis(); 
	        new TestThis(); 
	        object.get().n();           
	        object.n();
	    } 
	    


}
