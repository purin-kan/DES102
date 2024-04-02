import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator extends JPanel {
	
	BMICalculator() {
		this.setLayout(new BorderLayout());
		
		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		
		panel1();
		center.add(panel1_UserInformation, BorderLayout.NORTH);
		
		panel2();
		center.add(panel2_HeightAndWeight, BorderLayout.CENTER);
		
		panel3();
		center.add(panel3_BMIResult, BorderLayout.SOUTH);
		
		this.add(center, BorderLayout.CENTER);
	}
	
	JPanel panel1_UserInformation = new JPanel();
	JPanel panel2_HeightAndWeight = new JPanel();
	JPanel panel3_BMIResult = new JPanel();
	
	//panel 1
	JLabel subjectLabel;
	
	//panel 2
	JLabel heightLabel;
	JLabel weightLabel;
	JTextField heightField;
	JTextField weightField;
	
	//panel 3
	JButton calculateButton;
	JLabel resultLabel;
	
	private void panel1() {
		panel1_UserInformation.setLayout(new GridLayout(2, 1));
		
		subjectLabel = new JLabel("Enter your Information");
		panel1_UserInformation.add(subjectLabel);
	}
	
	private void panel2() {
		panel2_HeightAndWeight.setLayout(new GridLayout(2, 2));
		
		heightLabel = new JLabel("Your height(cm): ");
		weightLabel = new JLabel("Your weight(kg): ");
		heightField = new JTextField();
		weightField = new JTextField();
				
		panel2_HeightAndWeight.add(heightLabel);
		panel2_HeightAndWeight.add(heightField);
		panel2_HeightAndWeight.add(weightLabel);
		panel2_HeightAndWeight.add(weightField);
	}
	
	private void panel3() {
		panel3_BMIResult.setLayout(new GridLayout(2, 1));
		
		calculateButton = new JButton("Compute BMI");
		resultLabel = new JLabel("BMI =  ");
		
		panel3_BMIResult.add(calculateButton);
		panel3_BMIResult.add(resultLabel);

		calculateButton.addActionListener(new ActionInterpretor());
	}
	
	public class ActionInterpretor implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == calculateButton) {
				double height = Double.parseDouble(heightField.getText());
				double weight = Double.parseDouble(weightField.getText());
				
				height = height / 100;

				double result = weight / (height * height);
				
				resultLabel.setText("BMI = " + result);
			}
			
		}
		
	}
}



