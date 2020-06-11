package SimpleOOP;


class FinalEg2{  
	   //Blank final variable
	   final int MAX_VALUE;
		 
	   FinalEg2(){
	      //Blank final variable must be initialized in constructor
	      MAX_VALUE=100;
	   }
	   
	   void myMethod(){  
	      System.out.println(MAX_VALUE);
	   }  
	   public static void main(String args[]){  
		   FinalEg2 obj=new  FinalEg2();  
	      obj.myMethod();  
	   }  
	}