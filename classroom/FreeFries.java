/*************
FreeFries.java

Jennifer Ruiz Montalvo
This program reads points scored by home team and the opposing team and determines IF the fans win FreeFries
**************/
 import javax.swing.JOptionPane; //para uitlizar modo grafico GUI

 public class FreeFries{
   public static void main(String[]args) {
     int homePoints; //points scored by home team
     int opponentPoints; //points scored by opposing team

     homePoints = Integer.parseInt(JOptionPane.showInputDialog("Enter opponent points"));
     opponentPoints = Integer.parseInt(JOptionPane.showInputDialog("Enter opponent points"));
     if (homePoints > opponentPoints && homePoints >=100){
       JOptionPane.showMessageDialog(null, "A Free order of french fries Tigers Fans");
     }//end
  }//end main
}//end class fries
