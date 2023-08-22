package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil1 {
	
	public static String readProperty(String propname) {
		FileReader inputfile=null;
		
			try {
				inputfile=new FileReader("C:\\Users\\ranga\\eclipse-workspace\\projectMaven\\src\\main\\java\\configuration\\TestConfiguration1.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Properties p= new Properties();
			
			try {
				p.load(inputfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return p.getProperty(propname);
		
	}

}
