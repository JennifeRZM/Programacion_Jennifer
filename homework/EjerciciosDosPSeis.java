/*********
Jennifer Ruiz Montalvo
*********/
import javax.swing.JOptionPane;
public class EjerciciosDosPSeis{
  public static void main(String[] args) {
    int NP;
double TOT;

NP = Integer.parseInt(JOptionPane.showInputDialog("Numero de personas"));
if(200<NP && NP <= 300){
    TOT  =NP * 85;
}else if(NP > 300){
    TOT = NP * 75;
}else{
    TOT = NP * 95;
}

JOptionPane.showMessageDialog(null, "Presupuesto: " + TOT);

  }
}
