
import javax.swing.JOptionPane;

public class ComputeBMI {

	public static void main(String[] args) {

		double bmi;
		double meters = 0.0254;
		double pounds = 0.45359237;

		String weight = JOptionPane.showInputDialog("Enter your weight in pounds: ");
		double totalweight = Double.parseDouble(weight);
		
		String height = JOptionPane.showInputDialog("Enter your height in inches: ");
		double totalheight = Double.parseDouble(height);
		
		totalweight = totalweight * pounds;
		totalheight = totalheight * meters;
		
		bmi = totalweight/Math.pow(totalheight, 2);
		JOptionPane.showMessageDialog(null,"Your body mass index is " +bmi);
		

	}

}
