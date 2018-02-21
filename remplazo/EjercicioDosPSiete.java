/*******
Jennifer Ruiz Montalvo
*******/
import javax.swing.JOptionPane;
public class EjercicioDosPSiete{
  public static void main(String[] args) {
    String TI;
  int TA, K;
  double P,GA = 0;
  P =  Double.parseDouble(JOptionPane.showInputDialog("Cuanto cuesta el kilo de uva ?"));
  TI = JOptionPane.showInputDialog("Que tipo de uva es?(A o B)");
  TA = Integer.parseInt(JOptionPane.showInputDialog("Que tamaño es 1 o 2 ?"));
  K = Integer.parseInt(JOptionPane.showInputDialog("Cuantos kilos en el embarque ?"));
  if("A".equals(TI) || "a".equals(TI)){
      switch (TA) {

          case 1:
              P = P + 0.20;
              GA = K * P;
              break;
          case 2:
              P  = P + 0.30;
              GA = K * P;
              break;
          default:
              JOptionPane.showMessageDialog(null,"No hay de ese Tamaño");
              break;
      }
  }else if("B".equals(TI) || "b".equals(TI)){
      switch (TA){
          case 1:
              P = P - 0.30;
              GA = K * P;
              break;
          case 2:
              P = P - 0.50;
              GA = K *P;
              break;
          default:
              JOptionPane.showMessageDialog(null, "No existe ese Tamaño");

      }
  }



  JOptionPane.showMessageDialog(null,"Las ganancias es: " + GA);
}

}
