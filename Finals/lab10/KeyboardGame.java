import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyboardGame extends JPanel implements ActionListener, KeyListener {

    Random r = new Random();

    char currentLetter = (char) (r.nextInt(26) + 'A');
    char typedLetter = '?';
    int score = 0;

    Timer timer = new Timer(1000, this);

    public KeyboardGame() {
        setFocusable(true);
        timer.start();
        addKeyListener(this);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("SanSerif", Font.BOLD, 45));

        g.drawString("Letter: " + currentLetter, 75, 75);
        g.drawString("You Typed ", 75, 150);
        g.setColor(Color.BLUE);
        g.drawString("" + typedLetter, 350, 150);
        g.setColor(Color.BLACK);
        g.drawString("Your Score = " + score, 75, 225);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentLetter = (char) (r.nextInt(26) + 'A');
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        typedLetter = e.getKeyChar();
        if (typedLetter == currentLetter) {
            score++;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}