/**********
GreatestNumber.java

Jennifer Ruiz Montalvo
This program finds the greatest of three numbers
**********/
import javax.swing.JOptionPane;
public class GreatestNumber{
  public static void main(String[] args) {
    double numberOne, numberTwo, numberThree;

    numberOne = Double.parseDouble(JOptionPane.showInputDialog("Enter The first number"));//30
    numberTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));//10
    numberThree = Double.parseDouble(JOptionPane.showInputDialog("Enter the third number"));//80

  /*  if (numberOne > numberTwo) {
      if (numberOne > numberThree) {
        JOptionPane.showMessageDialog(null, "The greatest number is "+ numberOne);
      }//end if
    }//end if
    if (numberTwo > numberOne) {
      if (numberTwo > numberThree) {
        JOptionPane.showMessageDialog(null, " The greatest number is "+ numberTwo);
      } //end if
    }//end if
    if (numberThree > numberOne) {
      if (numberThree > numberTwo) {
        JOptionPane.showMessagesDialog(null, " The greatest number is "+ numberThree);
      }//end if
    } //end if  */
    if (numberOne > numberTwo && numberOne > numberThree){
      JOptionPane.show-showMessageDialog(null, "The greatest number is "+ numberOne);
    }else if(numberTwo > numberOne && numberTwo > numberThree){
    JOptionPane.show-showMessageDialog(null, "The greatest number"+ numberTwo;
  }else if(numberThree > numberOne && numberOne > numberThree){
    JOptionPane.show-showMessageDialog(null, "The greatest number"+ numberTwo;
  }
}
