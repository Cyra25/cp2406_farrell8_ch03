import javax.swing.JOptionPane;

public class NumbersDemo2 {

    public static void main(String[] args){
        String message;
        message = JOptionPane.showInputDialog(null,
                "Please enter the number","Number",JOptionPane.INFORMATION_MESSAGE);
        int a = Integer.parseInt(message);
        displayTwiceTheNumber(a);
        displayTwicePlusFive(a);
        displayTwiceNumberSquared(a);
    }
    public static void displayTwiceTheNumber(int a){
        JOptionPane.showMessageDialog(null, "Twice: "+ (2*a));
    }
    public static void displayTwicePlusFive(int a){
        JOptionPane.showMessageDialog(null, "Plus Five: "+(a+5));
    }
    public static void displayTwiceNumberSquared(int a){
        JOptionPane.showMessageDialog(null, "Squared: "+(a*a));
    }
}