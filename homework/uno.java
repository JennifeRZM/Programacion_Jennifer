import javax.swing.JOptionPane;
public class uno{
  public static void main(String[] args) {
    int C = 1;
      double VA, SU = 0;
              while(C<=10){
                  VA = Integer.parseInt(JOptionPane.showInputDialog("Numero " + C));
                  SU = SU +VA;
                  C++;
              }

              JOptionPane.showMessageDialog(null, SU);
      

}
}
