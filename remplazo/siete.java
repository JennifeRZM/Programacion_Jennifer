import javax.swing.JOptionPane;
public class siete{
  public static void main(String[] args) {

    int A= 0 , B= 0, C= 0;
double N,CN = 1,V,T1= 0,T2= 0,T3= 0,TT= 0;
N = Double.parseDouble(JOptionPane.showInputDialog("Cuatas ventas"));
while(CN <= N){
  V = Double.parseDouble(JOptionPane.showInputDialog("Venta "+ CN));
  if(V>1000){
      A = A +1;
      T1 =V;
      TT = TT + T1;
  }else if(V <=1000 && V > 500){
      B = B +1;
      T2 = V;
      TT = TT +T2;
  }else {
      C++;
      T3 = V;
      TT = T3;
  }

  CN++;
}

JOptionPane.showMessageDialog(null, "Total : "+TT+" T1 = " +T1+ " NO. A = "+A+" T2 = " +T2+ " NO. B = "+B+" T3 = " +T3+ " NO. C = "+C);

  }
}
