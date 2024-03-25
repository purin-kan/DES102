import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//Inherit appropriate superclass 
public class AdjustPanel extends JPanel {

	public AdjustPanel(String centerText) {
		//create three buttons: Less, center text, and more 
		JButton button_Less = new JButton("<<");
		JButton button_CenterText = new JButton(centerText);
		JButton button_More = new JButton(">>");

		//Add to this AdjustPanel panel
		this.setLayout(new GridLayout(1,3));

		this.add(button_Less);
		this.add(button_CenterText);
		this.add(button_More);
	}
}
