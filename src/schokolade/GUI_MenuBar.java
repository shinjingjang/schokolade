package schokolade;

import java.awt.Menu;
import java.awt.MenuItem;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class GUI_MenuBar extends JFrame{

	private JMenuBar mb=new JMenuBar();
	private JMenu jm=new JMenu();
	private Menu menu=new Menu();
	private MenuItem mi=new MenuItem();
	
	// extends JFrame braucht man noch ein JFrame object zu erzeugen?
	public JFrame jf=new JFrame();
	
	public GUI_MenuBar(){
		menubar();
		
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setSize(500,500);
		jf.setVisible(true);
	}
	
	private void menubar(){
		
	}
}
