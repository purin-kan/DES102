import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ElectricFan extends JPanel implements ActionListener, MouseListener {
	
	ElectricFan() {
		this.addMouseListener(this);
	}
	
	Timer timer = new Timer(50, this);
	int i = 0;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.GRAY);
		g.fillOval(295, 95, 210, 210);
		
		g.setColor(Color.WHITE);
		g.fillOval(300, 100, 200, 200);
		
		g.setColor(Color.ORANGE);
			
		g.fillArc(310, 110, 180, 180, i, 36);
		g.fillArc(310, 110, 180, 180, i + (72*1), 36);
		g.fillArc(310, 110, 180, 180, i + (72*2), 36);
		g.fillArc(310, 110, 180, 180, i + (72*3), 36);
		g.fillArc(310, 110, 180, 180, i + (72*4), 36);
		
		g.setColor(Color.GRAY);
		g.fillRect(380, 300, 45, 150);
		
		g.setColor(Color.BLUE);
		int[] x = {350, 450, 500, 300};
		int[] y = {450, 450, 550, 550};
		g.fillPolygon(x, y, 4);
		
		g.setColor(Color.RED);
		for (int j = 360; j<= 420; j=j+20) {
			g.fillRoundRect(j, 500, 17, 20, 20, 20);			
		}
		
		g.setColor(Color.WHITE);
		int l = 0;
		for (int k = 366; k<= 426; k=k+20) {
			g.drawString(Integer.toString(l), k, 514);
			l++;
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == timer) {
			i = i + 1;
			repaint();
		}
	}

	public double calculateDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		if (calculateDistance(x, y, 370, 510) <= 10) {
			timer.stop();
		} else if (calculateDistance(x, y, 390, 510) <= 10) {
			timer.start();
			timer.setDelay(200);
		} else if (calculateDistance(x, y, 410, 510) <= 10) {
			timer.start();
			timer.setDelay(50);
		} else if (calculateDistance(x, y, 430, 510) <= 10) {
			timer.start();
			timer.setDelay(10);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
