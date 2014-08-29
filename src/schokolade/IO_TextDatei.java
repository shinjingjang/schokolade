package schokolade;

import java.io.*;

public class IO_TextDatei {

	BufferedReader br;
	BufferedWriter bw;
	
	public IO_TextDatei() {
		textLesen();
		textschreiben2();
	}

	public void textLesen() {

		try {
			br = new BufferedReader(new FileReader("burgmann.txt"));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();;
		}

	}
	
	public void textschreiben(){
		
		
		try {
			bw=new BufferedWriter(new FileWriter("new file.txt"));
			
			bw.write("hier ist die erste Zeile");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		finally{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void textschreiben2(){
		String s="lese mich";
		String textname="text1.txt";
		
		FileOutputStream fo;
		try {
			fo = new FileOutputStream(textname);
			for(int i=0;i<s.length();i++){
				fo.write((byte)s.charAt(i));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){e.printStackTrace();}
		
	}
}
