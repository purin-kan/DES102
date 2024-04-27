import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CatchingFlashingBall extends JPanel {

    Random r = new Random();
    Timer timer = new Timer(1000, new TimerListener());

    int xpos = 0;
    int ypos = 0;
    int radius = 50;


    public CatchingFlashingBall() {
        timer.start();
        addMouseListener(new CatchingFlashBall());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.BLACK);
        g.setColor(Color.ORANGE);
        g.fillOval(xpos, ypos, radius, radius);
    }

    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            xpos = r.nextInt(getWidth() - radius);
            ypos = r.nextInt(getHeight() - radius);
            repaint();
        }
    }

    class CatchingFlashBall implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {

            if (calculateDistance(e.getX(), e.getY(), xpos, ypos) <= radius) {
                timer.stop();
            }
        }

        double calculateDistance(int x1, int y1, int x2, int y2) {
            return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
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
}
