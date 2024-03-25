import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Microwave extends JFrame {
	public Microwave() {
		this.setLayout(new BorderLayout());
		
		MicrowaveComponents();
		
		this.setTitle("The Front View of a Microwave Oven");
		this.setSize(550, 250);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void MicrowaveComponents() {
		//Create the first panel of MicrowaveLayout to position its components
		JPanel panal01_MicrowaveLayout = new JPanel();
		panal01_MicrowaveLayout.setLayout(new BorderLayout());
		
		//Add the first panel into the EAST of MicrowaveLayout
		this.add(panal01_MicrowaveLayout, BorderLayout.EAST);
		
		//Create a button to place foods at the CENTER of MicrowaveLayout
		JButton button_Foods = new JButton("Food to be placed here");
		this.add(button_Foods, BorderLayout.CENTER);
		
		//Create the second panel and set GridLayout for adding the button's numbers  
		JPanel panal02_NumberLayout = new JPanel();
		panal02_NumberLayout.setLayout(new GridLayout(4, 3));

		//At the first panel, Create a textfield to display its time at the NORTH of MicrowaveLayout
		JTextField textfield_TimeDisplay = new JTextField("Microwave Time Display");
		panal01_MicrowaveLayout.add(textfield_TimeDisplay, BorderLayout.NORTH);

		//Use a FOR loop to add the button's numbers into the NumberLayout
		for (int i = 1; i <= 9; i++) {
			JButton button = new JButton(Integer.toString(i));
			panal02_NumberLayout.add(button);
		}
		
		//Create three button(Stop, 0, Start) and add them into the second JPanel
		JButton button_Stop = new JButton("Stop");
		JButton button_0 = new JButton("0");
		JButton button_Start = new JButton("Start");

		panal02_NumberLayout.add(button_Stop);
		panal02_NumberLayout.add(button_0);
		panal02_NumberLayout.add(button_Start);

		//Add the second JPanel to the first panel at the CENTER of MicrowaveLayout
		panal01_MicrowaveLayout.add(panal02_NumberLayout, BorderLayout.CENTER);
		
	}
}
