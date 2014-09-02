package schokolade;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_Bild  extends JFrame{

	JFrame frame = new JFrame();

	public GUI_Bild() {

		JLabel imageLabel = new JLabel(new ImageIcon("tiger.jpg"));

		frame.getContentPane().add(imageLabel);
		frame.pack();
		frame.setVisible(true);
	}
}
