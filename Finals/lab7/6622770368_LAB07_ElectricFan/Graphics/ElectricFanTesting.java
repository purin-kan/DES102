package Graphics;

import javax.swing.JFrame;

public class ElectricFanTesting {
	public static void main(String[] args) {

	ElectricFan electricFan = new ElectricFan();

	JFrame frame = new JFrame("My Electric Fan");
	frame.setSize(800, 800);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.add(electricFan);
	}
}
