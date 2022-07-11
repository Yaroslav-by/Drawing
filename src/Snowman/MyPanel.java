package Snowman;

import java.awt.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	MyPanel() {
		this.setPreferredSize(new Dimension(600,600));
		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		//Bottom part
		g2D.setColor(Color.white);
		g2D.fillOval(200, 350, 200, 200);
		g2D.setColor(Color.black);
		g2D.setStroke(new BasicStroke(4));
		g2D.drawOval(200, 350, 200, 200);
		
		
		
		
		
	}
	
}
