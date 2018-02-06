/***************
Jennifer Ruiz Montalvo
***************/
import javax.swing.JOptionPane;
public class EjercicioDosPTres{
  public static void main(String[] args) {

     int nLapix;
     double pagar;
      nLapix = Integer.parseInt(JOptionPane.showInputDialog("Cuantos lapices va a compra?"));

      if(nLapix > 1000){
          pagar = nLapix * .85;
      }else{
          pagar = nLapix * .90;
      }

      JOptionPane.showMessageDialog(null, "Pagar " + pagar);

  }
}
