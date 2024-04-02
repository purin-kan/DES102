import javax.swing.JFrame;

public class KeyboardEventTesting {

	public static void main(String[] args) {
			
		JFrame frame = new JFrame("My Keyboard Event");
		
		KeyboardEvent keyboard = new KeyboardEvent();
		frame.add(keyboard);
		
		frame.setSize(800, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

