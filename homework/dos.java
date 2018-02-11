import javax.swing.JOptionPane;
public class dos{
  public static void main(String[] args) {
    int C = 1, ED, SU =0 , NU;
     double PR;
     NU = Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos son?"));
     while(C<= NU){
         ED = Integer.parseInt(JOptionPane.showInputDialog("Edad del alumon "+ C ));
         SU = SU +ED;
         C++;
     }
     PR = SU / NU;
     JOptionPane.showMessageDialog(null, PR);
  }
}
