/*******************
IfControlStatement.java

Jennifer Ruiz Montalvo
This program checks for period at the end of line.
*******************/
import javax.swing.JOptionPane;
public class IfcontrolStatement{
  public static void main(String[] args) {
    String sentence;
    int lastCharPosition;

    sentence = JOptionPane.showInputDialog("Enter your sentence");
    //hola world.

    lastCharPosition = sentence.length() - 1;

    if (sentence.charAt(lastCharPosition) !='.') {
      JOptionPane.showMessageDialog(null, "Invalid Entry - Your sentence needs a period");
    }//end if
  }//end main
}// end class
