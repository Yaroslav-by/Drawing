package TrafficLight;

import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {

	MyPanel() {
		this.setPreferredSize(new Dimension(600,600));
		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(Color.LIGHT_GRAY);
		g2D.fillRect(0, 0, 600, 600);
		
		g2D.setColor(Color.black);
		g2D.fillRoundRect(250, 100, 100, 360, 40, 40);
		
		g2D.fillRoundRect(275, 468, 50, 65, 20, 20);
		
		g2D.setColor(Color.red);
		g2D.fillOval(265, 140, 70, 70);
		
		g2D.setColor(Color.yellow);
		g2D.fillOval(265, 250, 70, 70);
		
		g2D.setColor(Color.green);
		g2D.fillOval(265, 360, 70, 70);
	}
}
