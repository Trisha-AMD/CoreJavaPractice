package OOPs;


import SimpleOOP.*;	
public class TestAddition {
   public static void main(String args[]){
	Addition obj = new Addition();
      
	/* It will throw error because we are trying to access
         * the default method in another package
         */
	obj.addTwoNumbers(10, 21);
   }
}