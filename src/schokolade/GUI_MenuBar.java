package schokolade;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI_MenuBar extends JFrame {

	private JMenuBar jmb = new JMenuBar();
	private JMenu jm = new JMenu("File");
	private JMenuItem jmi = new JMenuItem("Datei laden");
	private JTextArea ta = new JTextArea();

	JPanel jp = new JPanel();

	// extends JFrame braucht man noch ein JFrame object zu erzeugen?

	public <V>GUI_MenuBar(V v) {
		menubar();

		// ohne extends JFrame kann man EXIT_ON_CLOSE nicht rein
		// schreiben...weiss nicht warum
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);

	}

	private void menubar() {
		this.add(jp);
		jp.add(jmb);
		jmb.add(jm);
		jm.add(jmi);
		jp.add(ta);

		jmi.setActionCommand("Dateiladen");
		jmi.addActionListener(new ActionListener() {

			// unbedingt @Override schreiben
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(jmi)) {
					 JOptionPane.showMessageDialog(jp, e.getActionCommand());

					JFileChooser chooser = new JFileChooser();
					chooser.setFileFilter(new FileNameExtensionFilter(
							"images and texts", "jpg", "png", "txt"));

					chooser.showOpenDialog(null);
					File f = chooser.getSelectedFile().getAbsoluteFile();
					if (f != null && f.isFile()) {

						try {
							if (f.getPath().endsWith(".jpg")
									|| f.getPath().endsWith(".png")) {
								BufferedImage bi = ImageIO.read(f);
								Image img = bi.getScaledInstance(500, 500,
										Image.SCALE_SMOOTH);
								Graphics g = getGraphics();
								jp.paintComponents(g);
								g.drawImage(img, 0, 0, null);

							} else {
								if (f.getPath().endsWith(".txt")) {
									BufferedReader br = new BufferedReader(
											new FileReader(f));
									String s;
									while ((s = br.readLine()) != null) {
										ta.append("\n" + s);
									}
								}
							}

						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				}
			}

		});

		// Jxx passt nicht zu normale Menu, MenuItem
		// mb.add(menu);
		// jm.add(mi);
	}
}
