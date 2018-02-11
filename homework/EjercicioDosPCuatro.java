/*********
Jennifer Ruiz Montalvo
*********/
import javax.swing.JOptionPane;
public class EjercicioDosPCuatro{
  public static void main(String[] args) {
    double  CT ;
   double DE;
   double PF;

       CT = Integer.parseInt(JOptionPane.showInputDialog("Costo del traje"));
   if( CT > 2500){
       DE = CT * 0.15;
       PF = CT - DE;
   }else{
       DE = CT * 0.08;
       PF = CT -DE;
   }

 JOptionPane.showMessageDialog(null, "Costo traje " + CT + "  Descuento: "+DE + " Costo Final: "+ PF );
  }
}
