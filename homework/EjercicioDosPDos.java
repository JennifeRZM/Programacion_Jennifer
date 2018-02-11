/**************
Jennifer Ruiz Montalvo
**************/
import javax.swing.JOptionPane;
public class EjercicioDosPDos{
  public static void main(String[] args) {
    int numero1;


    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
    if(numero1 <0){
        JOptionPane.showMessageDialog(null, "numero mas grande es negativo " );
    }else{
        JOptionPane.showMessageDialog(null, "numero mas grande es positivo ");
    }

  }
}
