/*********
DaysInAMonth.java

Jennifer Ruiz Montalvoimport
This program finds the number of days in a monthimport
**********/
import javax.swing.JOptionPane;

public class DaysInAMonth{
  public static void main(String[] args) {
    int numberOfDaysInAMonth = 0;
    String monthOfYear;

monthOfYear =
JOptionPane.showInputDialog("Enter your month");

switch (monthOfYear){
  case "january":
  numberOfDaysInAMonth = 31;
  break;
  case "february":
  numberOfDaysInAMonth = 28;
  break;

}
  }
}
