public class Lavadora extends Electrodomesticos{
    double carga = 5;
    public Lavadora() {
        super();
    }
    public Lavadora(double precio,String Color, char Consumo, int peso, double carga1){
        super(precio, Color, Consumo, peso);
        this.carga = carga1;
    }
    public Lavadora(double precio, int peso){
        super(precio, peso);
    }

    public double getCarga() {
        return carga;
    }


    public double  precioFinal(){
        double EPr= getPrecioBase();
        if(carga > 30 ){
            EPr = EPr  + 50;
            setPrecioBase(EPr);
        }
        System.out.println("Lavadora = "+EPr);
        return  EPr;
    }

}
