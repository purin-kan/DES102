import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

//Inherit appropriate superclass 
public class Television extends JFrame {
	
	public Television(String title) {
		//set layout
		this.setLayout(new BorderLayout());

		//Call a method TelevisionComponents
		TelevisionComponents();

		//set JFrame
		this.setTitle("My Television");
		this.setSize(1600, 900);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void TelevisionComponents() {
		//create a button_TelevisionScreen and panal_TelevisionButtonBar
		JButton button_TelevisionScreen = new JButton("");
		BarPanel panal_TelevisionButtonBar = new BarPanel();
		
		//Add to this Television
		this.add(button_TelevisionScreen, BorderLayout.CENTER);
		this.add(panal_TelevisionButtonBar, BorderLayout.SOUTH);
	}
}
