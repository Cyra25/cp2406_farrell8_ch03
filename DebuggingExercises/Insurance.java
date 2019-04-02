import javax.swing.*;

public class Insurance {
    public static void main(String[] args){
        String getCurrentYear = JOptionPane.showInputDialog(null, "What is the current year?", "Current Year");
        String getBirthYear = JOptionPane.showInputDialog(null, "What is your birth year?", "Birth Year");
        int currentYear = Integer.parseInt(getCurrentYear);
        int birthYear = Integer.parseInt(getBirthYear);
        int premium = premiumCalculator(birthYear, currentYear);
        JOptionPane.showMessageDialog(null, "Premium amount: $" + premium);

    }

    public static int premiumCalculator(int birthYear, int currentYear){
        int age = currentYear - birthYear;
        int decade = age / 10;
        int premium = (decade + 15 ) *20;
        return premium;
    }
}
