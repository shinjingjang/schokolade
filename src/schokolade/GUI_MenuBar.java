package schokolade;

import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class GUI_MenuBar extends JFrame {

	private JMenuBar jmb=new JMenuBar();
	private JMenu jm=new JMenu("File");
	private JMenuItem jmi=new JMenuItem("Datei laden");
	
	private Menu menu=new Menu();
	private MenuItem mi=new MenuItem("Daten laden");
	
	
	JPanel jp=new JPanel();
	
	// extends JFrame braucht man noch ein JFrame object zu erzeugen?
	public JFrame jf=new JFrame();
	
	public GUI_MenuBar(){
		menubar();
		
		// ohne extends JFrame kann man EXIT_ON_CLOSE nicht rein schreiben...weiss nicht warum
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setSize(500,500);
		jf.setVisible(true);
	}
	
	private void menubar(){
		jf.add(jp);
		jp.add(jmb);
		jmb.add(jm);
		jm.add(jmi);
		
		jmi.setActionCommand("Dateiladen");
		jmi.addActionListener(new ActionListener(){
			
			// unbedingt @Override schreiben
			@Override
			public void actionPerformed(ActionEvent e){
				if(e.getSource().equals(jmi)){
					JOptionPane.showMessageDialog(jp, e.getActionCommand());
					JFileChooser chooser=new JFileChooser();
					chooser.showOpenDialog(null);
					File f=chooser.getSelectedFile().getAbsoluteFile();
					if(f !=null && f.isFile()){
					System.out.println(f.toString());
					// wie zeigt im Fenster an, was ich ausgewaehlt habe?
					}
				}
			}

		});
		
		// Jxx passt nicht zu normale Menu, MenuItem
		//mb.add(menu);		
		//jm.add(mi);
	}
}
