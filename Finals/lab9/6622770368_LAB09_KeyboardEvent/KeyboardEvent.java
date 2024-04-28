import java.awt.*;
import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardEvent extends JPanel implements KeyListener{
	
	String text;
	
	KeyboardEvent() {
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setFont(new Font("Calbri", Font.PLAIN, 24));
		g.setColor(Color.BLUE);
		g.drawString(text, 0, 100);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		text += e.getKeyChar();
		repaint();
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
