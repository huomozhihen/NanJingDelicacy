package presentation;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel{
	public Panel(MainFrame mf){
		this.setSize(800,640);
		this.setLocation(0,0);
		this.setVisible(true);
		this.setOpaque(false);
		this.setLayout(null);
		
		this.repaint();
		mf.getContentPane().add(this);
		mf.repaint();
	}
	public void paintComponent(Graphics g) {
		Image icon = new ImageIcon("image//07.jpg").getImage();
		g.drawImage(icon,0,0,this);
	}
}
