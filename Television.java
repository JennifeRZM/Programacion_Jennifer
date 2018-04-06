public class Television extends Electrodomesticos{
    //Resolucion en pulgadas
    int resolucion = 20 ;
    boolean SintonizadorTDT = false;

    public Television() {
        super();
    }
    public Television(double precio, int peso){
       super(precio, peso);
    }
    public Television(double precio,String Color, char Consumo, int peso, int resolucion1, boolean TDT ){
        super(precio, Color, Consumo, peso);
        this.resolucion = resolucion1;
        this.SintonizadorTDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return SintonizadorTDT;
    }

    public double  precioFinal(){
        double Final = getPrecioBase();

        if(resolucion > 40 ){
            Final = Final * 0.30;

           if(SintonizadorTDT == true){
               Final = Final + 50;
               setPrecioBase(getPrecioBase()+Final);
           } else{
               setPrecioBase(getPrecioBase()+Final);
           }
        }else{
            if(SintonizadorTDT == true){
               Final = Final + 50;
               setPrecioBase(getPrecioBase()+Final);
           }
        }
        System.out.println("Televicion Final = " +Final);
        return Final;
    }

}
