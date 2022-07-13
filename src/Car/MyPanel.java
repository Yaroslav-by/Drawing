package Car;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class MyPanel extends JPanel {

	MyPanel() {
		this.setPreferredSize(new Dimension(600,600));
		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		//Background
		g2D.setColor(Color.LIGHT_GRAY);;
		g2D.fillRect(0, 0, 600,600);
		
		//Wheels
		g2D.setColor(Color.white);
		g2D.fillOval(125, 460, 80, 80);
		g2D.fillOval(395, 460, 80, 80);
		g2D.setColor(Color.black);
		g2D.setStroke(new BasicStroke(25));
		g2D.drawOval(125, 460, 80, 80);
		g2D.drawOval(395, 460, 80, 80);
		
		g2D.setStroke(new BasicStroke());
		Area car = new Area(new Line2D.Double(220, 500, 380, 500));
		Area temp = new Area(new Arc2D.Double(110, 445, 110, 55, 0, 180, Arc2D.CHORD));
		
		g2D.draw(temp);
		
		
	}
}
