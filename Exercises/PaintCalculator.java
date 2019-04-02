import javax.swing.JOptionPane;
import java.awt.*;

public class PaintCalculator {
    public static void main(String[] args){
        int spacePerGallon = 350;
        String getLength = JOptionPane.showInputDialog(null, "Enter the length", "Length");
        double length = Double.parseDouble(getLength);
        String getWidth = JOptionPane.showInputDialog(null, "Enter the width", "Weight");
        double width = Double.parseDouble(getWidth);
        String getHeight = JOptionPane.showInputDialog(null, "Enter the height", "Height");
        double height = Double.parseDouble(getHeight);
        double wallArea = area(length,width,height);
        int price = gallonsNeeded(wallArea,spacePerGallon);
        JOptionPane.showMessageDialog(null, "The cost to paing a "+
                width+ "-by-" + length+"-foot room with "+ height+"-foot ceilings is $"+ price);


    }
    public static double area(double length, double width, double height){
        double wallArea = 2*(width*height)+2*(length*height);
        return wallArea;

    }
    public static int gallonsNeeded(double wallArea, int spacePerGallon){
        double gallonsRequired = wallArea/spacePerGallon;
        gallonsRequired = Math.ceil(gallonsRequired);
        JOptionPane.showMessageDialog(null, "Number of gallons needed is "+gallonsRequired);
        int pricePerGallon = 32;
        double price = gallonsRequired * pricePerGallon;
        return (int) price;

    }
}
