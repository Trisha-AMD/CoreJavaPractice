package SimpleOOP;

/* Base class vehicle */
class Vehicle 
{ 
    int maxSpeed = 120; 
    void message() 
    { 
        System.out.println("This is vehicle class"); 
    } 
    
    
    Vehicle(){
    	System.out.println("This is vehicle class constructor");
    }
 
} 
  
/* sub class Car extending vehicle */
class Car extends Vehicle 
{ 
    int maxSpeed = 180; 
    void message() 
    { 
        System.out.println("This is car class"); 
    } 
  
    /**1. Use of super with variables: This scenario occurs when a derived class and base class has same data members. 
     * In that case there is a possibility of ambiguity for the JVM. 
     */
    void display() 
    { 
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed); 
        
     // will invoke or call current class message() method 
        message(); 
        /**2. Use of super with methods: This is used when we want to call parent class method.
         *  So whenever a parent and child class have same named methods then to resolve ambiguity we use super keyword. 
         */
        
        
        // will invoke or call parent class message() method 
        super.message();
    } 
    
    /**3. Use of super with constructors: super keyword can also be used to access the parent class constructor. 
     * One more important thing is that, ‘’super’ can call both parametric as well as non parametric constructors 
     * depending upon the situation. 
     */
    Car(){
    	super();
    	
    	System.out.println("This is car class constructor");
    	
    	
    	
    }
} 
  
/* Driver program to test */
class testSuper 
{ 
    public static void main(String[] args) 
    { 
        Car small = new Car(); 
        small.display(); 
    } 
} 


