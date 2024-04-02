import javax.swing.JFrame;

public class ScribblePanelTesting {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Scribble Panel");
		ScribblePanel scribble = new ScribblePanel();
		frame.add(scribble);
		
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
