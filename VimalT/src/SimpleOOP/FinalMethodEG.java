package SimpleOOP;

class XYZ{  
	   final void demo(){
	      System.out.println("XYZ Class Method");
	   }  
	}  
		     
	class FinalMethodEG extends XYZ{  
	   void demo(){
	      System.out.println("ABC Class Method");
	   }  
		     
	   public static void main(String args[]){  
		   FinalMethodEG obj= new FinalMethodEG();  
	      obj.demo();  
	   }  
	}