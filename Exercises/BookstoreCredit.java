import javax.swing.JOptionPane;

public class BookstoreCredit {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog(null, "Please enter your name");
        String getGPA = JOptionPane.showInputDialog(null, "Please enter your GPA");
        double gpa = Double.parseDouble(getGPA);
        creditCalculator(name, gpa);

    }

    public static void creditCalculator(String name, double gpa){
        double credit = gpa * 10;
        JOptionPane.showMessageDialog(null, "Hello "+ name + "\nYour GPA is " + gpa+"\nYour credit is "+credit);

    }

}
