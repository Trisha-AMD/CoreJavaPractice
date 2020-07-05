package AllString;

public class Performance {

	public static void main(String[] args) {
	
		 long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Java");  
	        for (int i=0; i<5000000; i++){  
	            sb.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Java");  
	        for (int i=0; i<5000000; i++){  
	            sb2.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

	        
	        
	        System.out.println("---------------------Hashcode test of String:");  
	        String str="java";  
	        System.out.println(str.hashCode());  
	        str=str+"tpoint";  
	        System.out.println(str.hashCode());                  //String returns new hashcode value when you concat string but StringBuffer returns same.
	   
	        System.out.println("--------------------Hashcode test of StringBuffer:");  
	        StringBuffer sbf=new StringBuffer("java");  
	        System.out.println(sbf.hashCode());  
	        sb.append("tpoint");  
	        System.out.println(sbf.hashCode());  
	    
	        System.out.println("--------------------Hashcode test of StringBuilder:");  
	        StringBuffer sbd=new StringBuffer("java");  
	        System.out.println(sbd.hashCode());  
	        sb.append("tpoint");  
	        System.out.println(sbd.hashCode()); 
	
	
	
	}  
	
	        
	}


