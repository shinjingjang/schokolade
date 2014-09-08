package schokolade;

import java.util.Date;
import java.util.Locale;

public class MainClass {

	public static void main(String[] args) {
		//GUI_MenuBar menubar = new GUI_MenuBar("jj");
		// IO_TextDatei iot=new IO_TextDatei();
		//IO_BinDatei ioB = new IO_BinDatei();
		//IO_PropertiesDatei iop=new IO_PropertiesDatei();
		//GUI_LayoutManager glout= new GUI_LayoutManager();
		//GUI_Bild bild=new GUI_Bild();
		//Gernetics g=new Gernetics();
		//neuGUI i=new neuGUI();
		//Genertics<Integer> gc1=new Genertics<Integer>(32.8);
		Genertics<Integer>gc2=new Genertics<Integer>("Test",Locale.getDefault());
	gc2.setContent( new Integer(42));
	System.out.println(gc2.getContent());
	}

}
