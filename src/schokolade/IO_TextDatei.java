package schokolade;

import java.io.*;

public class IO_TextDatei {

	BufferedReader br;

	public IO_TextDatei() {
		textLesen();
	}

	public void textLesen() {

		try {
			br = new BufferedReader(new FileReader("burgmann.txt"));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();;
		}

	}
}
