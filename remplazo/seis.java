import javax.swing.JOptionPane;
public class seis{
  public static void main(String[] args) {
    int D = 0, SH = 0,HT;
       double PH ,SU;
       PH = Double.parseDouble(JOptionPane.showInputDialog("Pago por hora"));

       while(D<6){
           HT = Integer.parseInt(JOptionPane.showInputDialog("Horas por dia: "+ D));
           SH  =SH +HT;
           D++;
       }

       SU = SH * PH;
       System.out.println(SU);
  }
}
