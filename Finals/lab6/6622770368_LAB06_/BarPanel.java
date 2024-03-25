import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;

//Inherit appropriate superclass 
public class BarPanel extends JPanel {
	public BarPanel() {
		//Create controlpanel and textfield_ChVolDisplay
		this.setLayout(new BorderLayout());
		JTextField textfield_ChVolDisplay = new JTextField("Ch 35 Vol 45");
		ControlPanel controlPanel = new ControlPanel();

		//Add to this BarPanel panel
		this.setLayout(new BorderLayout());
		this.add(textfield_ChVolDisplay, BorderLayout.CENTER);
		this.add(controlPanel, BorderLayout.EAST);

	}
}
