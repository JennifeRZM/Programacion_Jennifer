/********
BMI.java

Jennifer Ruiz Montalvo
********/

import javax.swing.JOptionPane;

public class BMI{
  public static void main(String[]args) {
    float weight, heigth;
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    weight =
    Float.parseFloat(JOptionPane.showInputDialog("Enter your WEIGHT in pounds "));

    heigth =
    Float.parseFloat(JOptionPane.showInputDialog("Enter your HEIGTH in inches "));

    double weightInkilograms = weight * KILOGRAMS_PER_POUND;
    double heigthInMeters = heigth * METERS_PER_INCH;
    double bmi = weightInkilograms / (Math.pow(heigthInMeters,2));
    if (bmi < 16) {
      JOptionPane.showMessageDialog(null, "You are seriously underweight");
    } else if (bmi < 18) {
      JOptionPane.showMessageDialog(null, "You are underweight");
    } else if (bmi < 24) {
      JOptionPane.showMessageDialog(null, "You are normal weight");
  } else if (bmi < 29) {
    JOptionPane.showMessageDialog(null, "You are overweight");
} else if (bmi < 35) {
  JOptionPane.showMessageDialog(null, "You are overweight");
} else {
  JOptionPane.showMessageDialog(null, "You are gravely overweight");
  }
 }
}
