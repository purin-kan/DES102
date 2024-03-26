import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

class MovingMessagePanel extends JPanel implements ActionListener, ItemListener, MouseMotionListener {

    JFrame frame;

    MovingMessagePanel() {

        frame = new JFrame();

        frame.setLayout(new BorderLayout());

        panelComponents();
        registerActionListener();

        frame.add(this, BorderLayout.CENTER);

        frame.setTitle("My Moving Message Panel");
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JLabel messageLabel;
    JTextField messageField;

    JLabel colorLabel;
    JRadioButton white_colorRadioButton;
    JRadioButton black_colorRadioButton;

    JRadioButton useMouseButton;

    JButton leftButton;
    JButton rightButton;
    JButton upButton;
    JButton downButton;

    public void panelComponents() {
        // North
        JPanel messagePanel = new JPanel();

        messageLabel = new JLabel("Message to be displayed");
        messageField = new JTextField(20);

        messagePanel.add(messageLabel);
        messagePanel.add(messageField);

        frame.add(messagePanel, BorderLayout.NORTH);

        // West
        JPanel colorPanel = new JPanel();

        colorPanel.setLayout(new GridLayout(3, 1));

        colorLabel = new JLabel("Background Color");
        white_colorRadioButton = new JRadioButton("White");
        black_colorRadioButton = new JRadioButton("Black");

        ButtonGroup colorGroup = new ButtonGroup();

        colorPanel.add(colorLabel);
        colorPanel.add(black_colorRadioButton);
        colorPanel.add(white_colorRadioButton);

        colorGroup.add(black_colorRadioButton);
        colorGroup.add(white_colorRadioButton);

        frame.add(colorPanel, BorderLayout.WEST);

        // East
        JPanel radioPanel = new JPanel();

        radioPanel.setLayout(new GridLayout(1, 1));

        useMouseButton = new JRadioButton("Use Mouse");

        radioPanel.add(useMouseButton);

        frame.add(radioPanel, BorderLayout.EAST);

        // South
        JPanel directionPanel = new JPanel();

        leftButton = new JButton("Left");
        rightButton = new JButton("Right");
        upButton = new JButton("Up");
        downButton = new JButton("Down");

        directionPanel.add(leftButton);
        directionPanel.add(rightButton);
        directionPanel.add(upButton);
        directionPanel.add(downButton);

        frame.add(directionPanel, BorderLayout.SOUTH);
    }

    void registerActionListener() {
        messageField.addActionListener(this);

        white_colorRadioButton.addItemListener(this);
        black_colorRadioButton.addItemListener(this);

        useMouseButton.addItemListener(this);

        leftButton.addActionListener(this);
        rightButton.addActionListener(this);
        upButton.addActionListener(this);
        downButton.addActionListener(this);
    }

    Color textColor = Color.BLACK;
    int x = 100;
    int y = 100;
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(textColor);
        g.drawString(messageField.getText(), x, y);
    }


    // @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == leftButton) {
            x -= 10;
        } else if (source == rightButton) {
            x += 10;
        } else if (source == upButton) {
            y -= 10;
        } else if (source == downButton) {
            y += 10;
        } 
        repaint();

        if (source.equals(messageField)) {
            repaint();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getItemSelectable();
    
        if (source == white_colorRadioButton) {
            textColor = Color.BLACK;
            setBackground(Color.WHITE);
        } else if (source == black_colorRadioButton) {
            textColor = Color.PINK;
            setBackground(Color.BLACK);
        }

        if (source == useMouseButton) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                addMouseMotionListener(this);
            } else {
                removeMouseMotionListener(this);
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Do Nothing
    }
}