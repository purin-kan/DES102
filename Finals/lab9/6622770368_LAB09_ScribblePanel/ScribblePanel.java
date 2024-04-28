import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScribblePanel extends JPanel implements MouseMotionListener, MouseListener {

    ScribblePanel() {
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    int x;
    int y;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();

        if (e.getModifiersEx() == 1024) {
            g.setColor(Color.BLACK);
            g.drawLine(x, y, e.getX(), e.getY());
        } else {
            g.setColor(getBackground());
            g.fillOval(e.getX() - 10, e.getY() - 10, 20, 20);
        }

        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        repaint();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
