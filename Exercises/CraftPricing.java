import javax.swing.*;

public class CraftPricing {

    public static void main(String[] args){

        String productName = JOptionPane.showInputDialog(null, "Enter the name of the product");
        String getMaterialCost = JOptionPane.showInputDialog(null, "Enter the cost of the material.");
        double materialCost = Double.parseDouble(getMaterialCost);
        String getRequiredHours = JOptionPane.showInputDialog(null, "Enter the number of hours of work required to produce the product");
        double requiredHours = Double.parseDouble(getRequiredHours);
        double retailPrice = calcRetailPrice(materialCost, requiredHours);
        JOptionPane.showMessageDialog(null,
                "Name of the product - "+productName+
                "\nRetail Price - $" + retailPrice);
    }
    public static double calcRetailPrice(double materialCost, double requiredHours){
        int extraCost = 7;
        double retailPrice = ((materialCost + 12) * requiredHours)+ extraCost;
        return retailPrice;
    }

}
