package schokolade;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_LayoutManager extends JFrame{

	
	private JButton b1=new JButton("Button1");
	private JButton b2=new JButton("Button2");
	private JButton b3=new JButton("Button3");
	private JButton b4=new JButton("Button4");
	Container co;
	public GUI_LayoutManager(){
		
		 co=this.getContentPane();
		//boxLayout();
		// borderLayout();
		flowLayout();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
	}

	public void borderLayout(){
		co.setLayout(new BorderLayout());
		co.add(b1,BorderLayout.EAST);
		co.add(b2,BorderLayout.WEST);
		co.add(b3,BorderLayout.NORTH);
		co.add(b4,BorderLayout.SOUTH);
	}
	public void boxLayout(){
		co.setLayout(new BoxLayout(co, BoxLayout.X_AXIS));
		co.add(b1);
		co.add(b2);
		co.add(b3);
		co.add(b4);
	}
	public void flowLayout(){
		co.setLayout(new FlowLayout(FlowLayout.LEFT, 
                100, 100));
		co.add(b1);
		co.add(b2);
		co.add(b3);
		co.add(b4);
	}
}
