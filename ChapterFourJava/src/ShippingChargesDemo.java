import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ShippingChargesDemo 
{
	public static void main(String[] args)
	{
		double kilograms;
		double distance; 
		String input;
		
		input = JOptionPane.showInputDialog("Enter the weiht in kilograms? ");
		kilograms = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the distance to ship (in miles): ");
		distance = Double.parseDouble(input);
		
		ShippingCharges shipping = new ShippingCharges(kilograms, distance);
		
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		JOptionPane.showMessageDialog(null, "The shipping charges are $" + dollar.format(shipping.getShippingCharges()));
		
		System.exit(0);
		
		
	}
}
