/***********
FloorSpaceDoWhile.java

Jennifer Ruiz Montalvo
This program calculates total floor space in a house.
***********/
import javax.swing.JOptionPane;
public class FloorSpaceDoWhile{
  public static void main(String[] args) {
    double length, width; // room dimensions
    double floorSpace = 0; // house's total floor floorSpace
    char response; // user's response

    do{
      length = Double.parseDouble(JOptionPane.showInputDialog("Enter the room's length"));
      width = Double.parseDouble(JOptionPane.showInputDialog("Enter the room's width"));
      floorSpace += length * width;

      response = JOptionPane.showInputDialog("Anymore room?? y/n").charAt(0);
    }while(response == 'y' || response == 'Y');
    JOptionPane.showMessageDialog(null, "The total floor space is "+ floorSpace ,"hello" ,JOptionPane.WARNING_MESSAGE);
  }
}
