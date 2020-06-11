package JavaIO;

import java.io.*;

public class Buffer {

	public static void main(String[] args) throws IOException {
		// Input through Keyboard
InputStreamReader ir = new InputStreamReader (System.in);
BufferedReader br = new BufferedReader(ir);
System.out.println("Enter Number ");
int a = Integer.parseInt(br.readLine());
float b = Float.parseFloat(br.readLine());
String str = br.readLine();
System.out.println("Number1 = "+ a);
System.out.println("Number2 = "+ b);
System.out.println("Sentence = "+ str);

//Input through File
System.out.println("-------------------------------------------------------------------------------------------------------------");
FileReader fr = new FileReader ("C:\\Users\\Trishad\\Desktop\\Core Java\\Java Questions.txt");
BufferedReader br1 = new BufferedReader(fr);
String filer = br1.readLine();//read first line
System.out.println(filer); 
System.out.println("-------------------------------------------------------------------------------------------------------------");
System.out.println("File = "+ filer);
String st=br1.readLine() ; 
while ((st = br1.readLine()) != null) //read full file
  System.out.println(st); 


/*System.out.println("-------------------------------------------------------------------------------------------------------------");
File file = new File("C:\\\\Users\\\\Trishad\\\\Desktop\\\\Core Java\\\\Java Questions.txt"); 
FileReader fr1 = new FileReader(file);
BufferedReader br2 = new BufferedReader(fr1); 

String st=br2.readLine() ; 
while ((st = br2.readLine()) != null) 
  System.out.println(st); */


	}

}
/*1. read full file
2. search from file
*/