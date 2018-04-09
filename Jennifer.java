public class Jennifer {

    public static void main(String[] args) {
      Electrodomesticos ArrayElec[] = new Electrodomesticos[10];
       ArrayElec[0] = new Lavadora(150,"Negra",'E', 20, 40);
       ArrayElec[1] = new Lavadora(200, "Morada", 'F', 68, 10);
       ArrayElec[2] = new Lavadora(120, 23);
       ArrayElec[3] = new Lavadora(230, "Blanca",'A', 90, 12);
       ArrayElec[4] = new Lavadora(342, "rojo", 'B', 23, 35);
       ArrayElec[5] = new Television(120, 23);
       ArrayElec[6] = new Television(123, "Negro", 'D', 23, 42, true);
       ArrayElec[7] = new Television(234, "Rojo", 'F', 34, 20, false);
       ArrayElec[8] = new Television(266, "gris", 'Z', 34, 20, true);
       ArrayElec[9] = new Television(90, "Azul", 'E', 234, 50, false);
       double Total =0;
       for(int i=0;i<ArrayElec.length;i++){
          ArrayElec[i].comprobarColor(ArrayElec[i].getColor());
          ArrayElec[i].comprobarConsumoEnergetico(ArrayElec[i].getConsumoE());
           ArrayElec[i].precioFinalP();
           if(ArrayElec[i] instanceof Lavadora){
               Total = Total +((Lavadora)ArrayElec[i]).precioFinal();
           }else if(ArrayElec[i] instanceof Television){
               Total = Total + ((Television) ArrayElec[i]).precioFinal();
           }

       }
       System.out.println("Total a pagar por los 10 productos = " + Total);
   }



}
