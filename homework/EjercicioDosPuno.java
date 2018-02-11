/*********
2.1
Jennifer Ruiz Montalvo
**********/
import javax.swing.JOptionPane;


public class EjercicioDosPuno{
  public static void main(String[] args) {
    int numero1;
        int numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero "));
        if(numero1 < numero2){
            JOptionPane.showMessageDialog(null, "numero mas grande es: " + numero2);
        }else{
            JOptionPane.showMessageDialog(null, "numero mas grande es: " + numero1);
        }

  }
}
