import javax.swing.JOptionPane;
public class tres{
  public static void main(String[] args) {

    int M= 0;
     double AH,CA = 0;
     while(M<= 12){

         AH = Double.parseDouble(JOptionPane.showInputDialog("Ahorro"));
         CA = CA +AH;
         M++;
     }

     JOptionPane.showMessageDialog(null, "Ahorrado por todo el año " + CA);
  }
}
