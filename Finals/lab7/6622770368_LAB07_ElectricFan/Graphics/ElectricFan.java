package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ElectricFan extends JPanel {	//a subclass of JPanel 
	public void paintComponent(Graphics g) {

		// Exercise 1: Fan's frame
		g.setColor(Color.GRAY);
		g.fillOval(295, 95, 210, 210);
		g.setColor(Color.WHITE);
		g.fillOval(300, 100, 200, 200);

		// Exercise 2: Fan's Blades
		g.setColor(Color.ORANGE);
		for (int i = 0; i < 360; i += 72) {
			g.fillArc(310, 110, 180, 180, i, 36);
		}
		
		// Exercise 3: Fan's neck 
		g.setColor(Color.GRAY);
		g.fillRect(380, 300, 45, 150);

		// Exercise 4: Fan's base
		int[] base_X = {350, 450, 500, 300};
		int[] base_Y = {450, 450, 550, 550};
		g.setColor(Color.BLUE);
		g.fillPolygon(base_X, base_Y, 4);

		// Exercise 5: Four red round speed buttons
		g.setColor(Color.RED);
		for (int i = 360; i <=420; i += 20) {
			g.fillRoundRect(i, 500, 17, 20, 20, 20);
		}
		
		// Exercise 5: Fan's speed buttons
		g.setColor(Color.WHITE);
		int num = 0;
		for (int i = 366; i <=426; i += 20) {
			g.drawString(Integer.toString(num), i, 514);
			num++;
		}
	}
}