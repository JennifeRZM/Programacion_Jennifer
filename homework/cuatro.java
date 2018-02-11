import javax.swing.JOptionPane;
public class cuatro{
  public static void main(String[] args) {
    int C = 0, CA = 0, CP = 0, CN = 0;
     double NU =0 ;
     NU = Integer.parseInt(JOptionPane.showInputDialog("Cuantas cantidades"));
     while(C<NU){
         CA = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a leer"));
         if(CA < 0){
             CN = CN +1;
         }else{
             CP = CP +1;
         }
         C++;
     }
      JOptionPane.showMessageDialog(null,"negativos: "+CN+" Positivos: "+CP);
           
  }
}
