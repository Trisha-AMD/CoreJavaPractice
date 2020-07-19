package ArrayExamples;

public class TransposeArray {

	public static void main(String args[]){  
		//declaring and initializing 2D array  
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  // arr[no of rows][no of elements in each rows]
		//printing 2D array 
		 	 	
		for(int i=0;i<arr.length;i++){  //arr.length gives the number of rows in the matrix
		 for(int j=0;j<arr[i].length;j++){  //arr[i].length gives the length of the elements in each row of the matrix
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
		
        
	//Transpose
        
        for (int i=0; i<arr.length; i++)  
        {
            for(int j=0; j<arr[i].length; j++) { 
                
        System.out.print(arr[j][i]+" ");
            }
        System.out.println();//new line  
    }
        
        
        
        
        
        
        
		
        
        
        
	
}
}