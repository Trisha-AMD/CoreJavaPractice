package SimpleOOP;

class FinalEG{  

	   final int MAX_VALUE=99; //We cannot change the value of a final variable once it is initialized.
	   void myMethod(){  
	      MAX_VALUE=101;
	   }  
	   public static void main(String args[]){  
		   FinalEG obj=new  FinalEG();  
	      obj.myMethod();  
	   }  
	}
