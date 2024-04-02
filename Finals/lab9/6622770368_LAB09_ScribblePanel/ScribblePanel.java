import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class ScribblePanel extends JPanel implements MouseListener, MouseMotionListener {

	ScribblePanel(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	int x;
	int y;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		
		
		if (e.getModifiers() == InputEvent.BUTTON1_MASK) {
			//Left click
			g.setColor(Color.BLACK);
			g.drawLine(x, y, e.getX(), e.getY());
			
		} else {
			//Right click
			g.setColor(getBackground());
			g.drawOval(e.getX() - 10, e.getY() - 10, 20, 20);
			
		}
		x = e.getX();
		y = e.getY();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		repaint();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
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
