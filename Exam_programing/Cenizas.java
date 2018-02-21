/*********
DaysInAMonth.java

Jennifer Ruiz Montalvoimport
This program finds the number of days in a monthimport
**********/
import javax.swing.JOptionPane;

public class Cenizas{
  public static void main(String[] args) {
    int D, M, A;//D =Dia, M  = Mes , A = año , R = resultado;
    int R = 0;
    D = Integer.parseInt(JOptionPane.showInputDialog("Dia de Domingo de Resureccion"));
    M = Integer.parseInt(JOptionPane.showInputDialog("Mes de Domingo de Resureccion"));
    A = Integer.parseInt(JOptionPane.showInputDialog("Año de Domingo de Resureccion"));
    if((A % 4 == 0) && ((A % 100 != 0) || (A % 400 == 0))){
        //El añoo es bisiesto

            R = D -46;


        if(R < 0){
            M = M - 1;
        }

        //30 dia Abril, junio, septiembre y noviembre.
        //29 febrero
        //32 dias Enero, marzo, mayo, julio, agosto, octubre y diciembre.
        switch (M) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                //31 dias
                R = 31 + R;
                break;
            case 2:
                //29 dias
                R = 29 + R;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                // 30 dias
                R = 30 + R;
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, "Fecha de Miercoles de ceniza "
                + R +"/"+M+"/"+A);
    }else{
                //Año normal
            R = D -46;


        if(R < 0){
            M = M - 1;
        }

        //30 dia Abril, junio, septiembre y noviembre.
        //28 febrero
        //31 dias Enero, marzo, mayo, julio, agosto, octubre y diciembre.
        switch (M) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                //31 dias
                R = 31 + R;
                break;
            case 2:
                //29 dias
                R = 28 + R;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                // 30 dias
                R = 30 + R;
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, "Fecha de Miercoles de ceniza "
                + R +"/"+M+"/"+A);
    }
  }
}
