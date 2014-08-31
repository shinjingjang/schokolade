package schokolade;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_LayoutManager extends JFrame {

	private JButton b1 = new JButton("Button1");
	private JButton b2 = new JButton("Button2");
	private JButton b3 = new JButton("Button3");
	private JButton b4 = new JButton("Button4");
	Container co;

	public GUI_LayoutManager() {

		co = this.getContentPane();
		// boxLayout();
		// borderLayout();
		// flowLayout();
		//gridLayout();
		gribagLayout();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
	}

	public void borderLayout() {
		co.setLayout(new BorderLayout());
		co.add(b1, BorderLayout.EAST);
		co.add(b2, BorderLayout.WEST);
		co.add(b3, BorderLayout.NORTH);
		co.add(b4, BorderLayout.SOUTH);
	}

	public void boxLayout() {
		co.setLayout(new BoxLayout(co, BoxLayout.X_AXIS));
		co.add(b1);
		co.add(b2);
		co.add(b3);
		co.add(b4);
	}

	public void flowLayout() {
		co.setLayout(new FlowLayout(FlowLayout.LEFT, 100, 100));
		co.add(b1);
		co.add(b2);
		co.add(b3);
		co.add(b4);
	}

	public void gridLayout() {
		// wie viel stueck in (heurizontal, vertika)
		co.setLayout(new GridLayout(2, 2));
		co.add(b1);
		co.add(b2);
		co.add(b3);
		co.add(b4);
	}

	public void gribagLayout() {
		
		GridBagLayout gbl = new GridBagLayout();
		co.setLayout(gbl);
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0; // x-Position
		c.gridy = 0; // y-Position
		c.gridwidth = 1; // Breite
		c.gridheight = 2; // Höhe
		gbl.setConstraints(b1, c); // zum GridBagConstraints hinzufügen
		co.add(b1);
		
		
		c.gridx = 1; // x-Position
		c.gridy = 0; // y-Position
		c.gridwidth = 3; // Breite
		c.gridheight = 1; // Höhe
		gbl.setConstraints(b2, c); // zum GridBagConstraints hinzufügen
		co.add(b2);
		
		
		c.gridx = 1; // x-Position
		c.gridy = 1; // y-Position
		c.gridwidth = 2; // Breite
		c.gridheight = 1; // Höhe
		gbl.setConstraints(b3, c); // zum GridBagConstraints hinzufügen
		co.add(b3);
		
		
		c.gridx = 3; // x-Position
		c.gridy = 1; // y-Position
		c.gridwidth = 1; // Breite
		c.gridheight = 2; // Höhe
		gbl.setConstraints(b4, c); // zum GridBagConstraints hinzufügen
		co.add(b4);

	}
}
