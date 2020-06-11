package ReadFromFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream; 
import java.util.Properties;


public class PropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        readPropertiesFile();
            
    }
    
    public static void readPropertiesFile() {

 

    Properties prop = new Properties();
    try {
        
        InputStream input = new FileInputStream("D:\\Work\\DHL_Test\\config.properties");
    prop.load(input);
    System.out.println(prop.getProperty("browser"));
    System.out.println(prop.getProperty("Student"));
    System.out.println(prop.getProperty("Teacher"));
    } 
    
    catch (Exception e) {
        
        e.printStackTrace();
    }
    
    finally {
    	System.out.println("The end of program");
    }
    
    }
}