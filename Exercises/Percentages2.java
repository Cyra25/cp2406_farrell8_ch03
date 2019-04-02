import javax.swing.JOptionPane;

public class Percentages2 {
    public static void main(String[] args){
        String message = JOptionPane.showInputDialog(null, "Please enter the first number");
        double firstNum = Double.parseDouble(message);
        String secondMessage = JOptionPane.showInputDialog(null, "Please enter second number");
        double secondNum = Double.parseDouble(secondMessage);
        computerPercent(firstNum,secondNum);
        computerPercent(secondNum, firstNum);
    }

    public static void computerPercent(double firstNum, double secondNum){
        double percentage = 100*firstNum/secondNum;
        JOptionPane.showMessageDialog(null, firstNum+ " is "+ percentage+ " percent of "+ secondNum);
    }
}

