import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//Inherit appropriate superclass 
public class ControlPanel extends JPanel {
	public ControlPanel() {		
		
		//create a On/Of button and add to the power panel 
		this.setLayout(new GridLayout(1, 3));
		JButton button_OnOff = new JButton("On/Off");

		//create two adjust panels and add to the layout of this control Panel
		AdjustPanel adjustPanel_Ch = new AdjustPanel("Ch");
		AdjustPanel adjustPanel_Vol = new AdjustPanel("Vol");

		this.add(adjustPanel_Ch);
		this.add(adjustPanel_Vol);
		this.add(button_OnOff);

	}
}
