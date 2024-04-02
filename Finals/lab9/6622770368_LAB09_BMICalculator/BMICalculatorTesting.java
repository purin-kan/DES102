import javax.swing.JFrame;

public class BMICalculatorTesting {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My BMI Calculator");
		BMICalculator calculator = new BMICalculator();
		frame.add(calculator);
		
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
