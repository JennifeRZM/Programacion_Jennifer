/********
Jennifer Ruiz Montalvo
********/
public class EjercicioDosPCinco{
  public static void main(String[] args) {
    int A, B, C, M;
  A = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
  B = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
  C = Integer.parseInt(JOptionPane.showInputDialog("Valor 3"));
  if(A > B){
      if(A >C){
          M = A;
      }else{
          M = C;
      }
  }else if(B > C){
      M = B;
  }else{
      M =C;
  }

  JOptionPane.showMessageDialog(null,"El mayor es: " + M);

  }
}
