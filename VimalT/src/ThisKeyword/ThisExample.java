package ThisKeyword;

//1) this: to refer current class instance variable

class ThisExample
{  
     int rollno;  
     String name;  
     float fee;  
     int ID;
     String Address;

           void Student(int rollno,String name,float fee, int ID,String Address)
           {  
                   this.rollno=rollno=1;  //refers to the current class instance variable
                   this.name=name;  
                   this.fee=fee;  
                   ID= ID=2;             //does not get referred so the display function prints 0
                   Address= Address;     //does not get referred so the display function prints null
           }  

           ThisExample(int age,String Gender,float Height)  //Constructor
           {  

	               System.out.println(age+" "+Gender+" "+Height);
	
           }  


             void display()
             {
	                System.out.println(rollno+" "+name+" "+fee+" "+ID+"  "+Address);
	         }  

             
             // overriding toString method to print the object as a string
             public String toString()
             {
	          
			       return Address+"  "+rollno;
	         }  
 
             public static void main(String args[])
             {  
                     ThisExample s1=new ThisExample(22,"Male",2.3f);  
                     s1.Student(23, "abc", 200f,21,"Andheri");
                     s1.display();  
                     System.out.println(s1);   //representing an object as a string
             }

}