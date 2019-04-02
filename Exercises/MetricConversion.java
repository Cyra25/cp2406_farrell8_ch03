import javax.swing.JOptionPane;

public class MetricConversion {

    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog(null, "Enter number");
        int number = Integer.parseInt(message);
        inchesToCm(number);
        gallonsToLiters(number);
    }
    public static void inchesToCm(int number){
        double centimeters = 2.54*number;
        JOptionPane.showMessageDialog(null, number + " inches equal to "+ centimeters + " centimeters.");
    }
    public static void gallonsToLiters(int number){
        double liters = 3.7854 * number;
        JOptionPane.showMessageDialog(null, number+ " gallons equal to "+String.format("%.2f",liters)  + " liters.");
    }

}
