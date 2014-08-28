package schokolade;

import java.io.*;

public class IO_TextDatei {
	
	
	BufferedReader br;
	
	public IO_TextDatei(){
		textLesen();
	}
	
	public void textLesen(){
		
		try {
			br=new BufferedReader(new FileReader("burgmann.txt"));
			System.out.println(br);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
