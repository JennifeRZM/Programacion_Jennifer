import javax.swing.JOptionPane;
public class ocho{
  public static void main(String[] args) {

      int I=1;
      double P= 0 , T=0;
      while(I<=20){
          P = P + 10;
          T =T+P;
          I++;
      }
      System.out.println(T);

  }
}
