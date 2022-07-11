package Snowman;

import java.awt.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	MyPanel() {
		this.setPreferredSize(new Dimension(600,600));
		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		//Background
		g2D.setColor(Color.LIGHT_GRAY);
		g2D.fillRect(0, 0, 600, 600);
		
		//Bottom part
		g2D.setColor(Color.white);
		g2D.fillOval(200, 350, 200, 200);
		g2D.setColor(Color.black);
		g2D.setStroke(new BasicStroke(4));
		g2D.drawOval(200, 350, 200, 200);
		
		//Middle part
		g2D.setColor(Color.white);
		
		g2D.setColor(Color.black);
		//g2D.drawPolygon(new int[] {}, new int[] {}, 1);
		
		g2D.setColor(Color.white);
		g2D.fillOval(225, 235, 150, 150);
		g2D.setColor(Color.black);
		g2D.drawOval(225, 235, 150, 150);
		
		//Top part
		g2D.setColor(Color.white);
		g2D.fillOval(250, 150, 100, 100);
		g2D.setColor(Color.black);
		g2D.drawOval(250, 150, 100, 100);
		
		//Hat
		g2D.setColor(Color.white);
		g2D.fillOval(240, 140, 120, 30);
		g2D.setColor(Color.black);
		g2D.drawOval(240, 140, 120, 30);
		g2D.setColor(Color.white);
		g2D.fillRoundRect(265, 83, 70, 65, 5, 5);
		g2D.setColor(Color.black);
		g2D.drawRoundRect(265, 83, 70, 65, 5, 5);
		g2D.drawLine(265, 130, 335, 130);
		
		g2D.setStroke(new BasicStroke(3));
		//Face and other stuff
		g2D.setColor(Color.white);
		g2D.fillOval(290, 182, 13, 13);
		g2D.fillOval(320, 182, 13, 13);
		g2D.fillOval(280, 220, 9, 9);
		g2D.fillOval(295, 230, 9, 9);
		g2D.fillOval(310, 230, 9, 9);
		g2D.fillOval(325, 220, 9, 9);
		g2D.fillOval(305, 280, 9, 9);
		g2D.fillOval(305, 310, 9, 9);
		g2D.fillOval(305, 340, 9, 9);
		g2D.fillPolygon(new int[] {308, 307, 380}, new int[] {215, 200, 202}, 3);
		g2D.setColor(Color.black);
		g2D.drawOval(290, 182, 13, 13);
		g2D.drawOval(320, 182, 13, 13);
		g2D.drawOval(280, 220, 9, 9);
		g2D.drawOval(295, 230, 9, 9);
		g2D.drawOval(310, 230, 9, 9);
		g2D.drawOval(325, 220, 9, 9);
		g2D.drawOval(305, 280, 9, 9);
		g2D.drawOval(305, 310, 9, 9);
		g2D.drawOval(305, 340, 9, 9);
		g2D.drawPolygon(new int[] {308, 307, 380}, new int[] {215, 200, 202}, 3);
		
		
		
		
		
		
		
		
	}
	
}
