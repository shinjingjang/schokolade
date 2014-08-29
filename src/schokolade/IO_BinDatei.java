package schokolade;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_BinDatei {

	BufferedInputStream bis;
	BufferedOutputStream bos;
	public IO_BinDatei(){
		dateiLesen();
	}
	
	public void dateiLesen(){
		try {
			bis=new BufferedInputStream(new FileInputStream("burgmann.bin"));
			bos=new BufferedOutputStream(new FileOutputStream("neu burgmann.bin"));
			int i;
			while((i=bis.read())!=-1){
				bos.write(i);;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
