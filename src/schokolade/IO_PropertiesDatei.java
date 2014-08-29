package schokolade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class IO_PropertiesDatei {
	
	Properties p=new Properties();
	
	FileInputStream fis;
	public IO_PropertiesDatei(){
		propertiesLesen();
	}
	
	public void propertiesLesen(){
		try {
			fis =new FileInputStream(new File("burgmann.properties"));
			
			p.load(fis);
			String str = p.getProperty("plz");
			System.out.println(str); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
