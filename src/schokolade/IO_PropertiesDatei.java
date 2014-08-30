package schokolade;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class IO_PropertiesDatei {
	
	Properties p=new Properties(System.getProperties());
	
	FileInputStream fis;
	BufferedOutputStream fos;
	
	public IO_PropertiesDatei(){
		propertiesLesenSchreiben();
	}
	
	public void propertiesLesenSchreiben(){
		try {
			fis =new FileInputStream(new File("burgmann.properties"));
			fos=new BufferedOutputStream(new FileOutputStream(new File("neu burgmann.properties")));
			p.load(fis);
			
			//print eine bestimmte Info des Properties
			String str = p.getProperty("plz");
			System.out.println(str); 
			
			// print alle Info des Properties zu anderer neuen Datei
			p.store(fos, "This is properties data");
//		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
