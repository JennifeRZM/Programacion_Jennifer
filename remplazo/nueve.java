import javax.swing.JOptionPane;
public class nueve{
  public static void main(String[] args) {

      int N, I =1;
      double HT =0 , PH=0,SS=0;

      N =Integer.parseInt(JOptionPane.showInputDialog("Trabajadores"));
      PH = Double.parseDouble(JOptionPane.showInputDialog("Pago por hora"));
      while(I<=N){
          HT = Double.parseDouble(JOptionPane.showInputDialog("Trabajo x semana el empleado NO. " +I));
          SS = HT * PH;
          System.out.println("Empleado No. "+I +" Gano esta semana "+SS);
          I++;
      }
  }
}
